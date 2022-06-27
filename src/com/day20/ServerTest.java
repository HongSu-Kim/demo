package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null; // 서버는 두 소켓 다 필요
	private Socket sc = null;

	public ServerTest() {

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("채팅 서버");
		setSize(300, 400);
		setVisible(true);

	}

	@Override
	public void run() { // 메세지 받기

		String msg;
		String ip;

		try {
			if (sc == null) { // sc가 null이면 클라이언트가 접속을 안한 상태
				return;
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream())); // sc가 보내준 내용을 br에 저장

			ip = sc.getInetAddress().getHostAddress(); // Client IP
			ta.append("\r\n[" + ip + "] 접속!"); //

			while ((msg = br.readLine()) != null) {
				ta.append("\r\n" + msg);
			}

		} catch (Exception e) {
			ta.append("\r\n클라이언트 연결 종료...");
			sc = null; // 쓰레기 값이 남지 않게 비워줌
			ss = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 메세지 보내기

		String msg = tf.getText();
		if (msg.trim().equals("")) { // 공백제거 후 문자열 값이 ""이면 안보냄
			return;
		}

		if (sc == null) { // Client가 미접속시
			return;
		}

		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true); // true : flush와 같은 기능

			pw.println("서버]" + msg); // 클라이언트에 전송

			ta.append("\r\n서버] " + msg); // 내 창에 출력
			tf.setText(""); // TextField 비우기
			tf.requestFocus(); // TextField 포커싱

		} catch (Exception e2) {
			ta.append("\r\n클라이언트와 연결 종료...");
			sc = null;
		}

	}

	public void serverStart() {

		try {

			ss = new ServerSocket(7777); // 7777 : ServerPort
			ta.setText("서버시작!!");

			sc = ss.accept(); // Server와 Client를 연결

			Thread th = new Thread(this);
			th.start(); // Client의 채팅을 받기위해서 Thread를 시작

		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {

		new ServerTest().serverStart();

	}

}
