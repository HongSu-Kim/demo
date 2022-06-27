package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

// 그룹채팅
// D class : 224.0.0.0 ~ 239.255.255.255

public class ChatCS extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.1.1.1";
	private int port = 7777;
	private String userName = "수지";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	// UDP : 속도 - TCP : 신뢰성
	// DatagramSocket : UDP로 데이터를 전송하거나 수신
	// DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터
	// MulticastSocket : 다수의 클라이언트한테 DatagramPacket을 전송

	public ChatCS() {

		ta.setEditable(false); // 편집 불가능
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("그룹채팅 [" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
	}

	public void setup() { // 연결

		try {
			xGroup = InetAddress.getByName(host); // ip : 230.1.1.1
			ms = new MulticastSocket(port); // post : 7777

			ms.joinGroup(xGroup); // 같은 xGrop, ms를 가지는 그룹에 참가

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void disConnection() { // 연결 끊기

		try {
			ms.leaveGroup(xGroup); // 그룹에서 빠져나옴
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public void run() {

		try {
			while (true) {
				byte[] buffer = new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp); // 수신
				String msg = new String(dp.getData()).trim(); // byte를 String으로 변환
				ta.append(msg + "\r\n"); // 출력
			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnection(); // 연결 종료
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String msg = tf.getText().trim();

		if (msg.equals("")) {
			return;
		}

		byte[] buffer = (userName + "]" + msg).getBytes(); // String을 Byte로 변경해서 buffer에 저장

		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			ms.send(dp); // 전송

			tf.setText("");
			tf.requestFocus();

		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
	}

	public static void main(String[] args) {

		new ChatCS().setup();

	}
}