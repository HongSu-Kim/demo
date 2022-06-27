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
import java.net.Socket;

public class ClientTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	private Socket sc = null;
	private int port = 7777;
	private String host = "localhost"; // 서버ip // localhost : (127.0.0.1), (10.10.6.97)

	public ClientTest() {

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("채팅 클라이언트");
		setSize(300, 400);
		setVisible(true);

	}

	@Override
	public void run() { // 메세지 받기

		String msg;

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream())); // sc가 보내준 내용을 br에 저장

			while ((msg = br.readLine()) != null) {
				ta.append("\r\n" + msg);
			}

		} catch (Exception e) {
			ta.append("\r\n서버 연결 종료...");
			sc = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 메세지 보내기

		String msg = tf.getText();
		if (msg.trim().equals("")) { // 공백제거 후 문자열 값이 ""이면 안보냄
			return;
		}

		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true); // true : flush와 같은 기능

			pw.println("김홍수]" + msg); // 서버에 msg 전송

			ta.append("\r\n김홍수] " + msg); // 내 창에 msg 출력
			tf.setText(""); // TextField 비우기
			tf.requestFocus(); // TextField 포커싱

		} catch (Exception e2) {
			ta.append("\r\n서버와 연결 종료...");
			sc = null;
		}

	}

	public void connect() {

		try {

			sc = new Socket(host, port); // ip와 port를 소켓에 넣고 보냄 // 접속시도

			Thread th = new Thread(this);
			th.start(); // Client의 채팅을 받기위해서 Thread를 시작

		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {

		new ClientTest().connect();

	}

}
