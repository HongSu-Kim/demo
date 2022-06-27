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

// �׷�ä��
// D class : 224.0.0.0 ~ 239.255.255.255

public class ChatCS extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.1.1.1";
	private int port = 7777;
	private String userName = "����";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	// UDP : �ӵ� - TCP : �ŷڼ�
	// DatagramSocket : UDP�� �����͸� �����ϰų� ����
	// DatagramPacket : UDP�� �̿��Ͽ� ���۵� �� �ִ� ������
	// MulticastSocket : �ټ��� Ŭ���̾�Ʈ���� DatagramPacket�� ����

	public ChatCS() {

		ta.setEditable(false); // ���� �Ұ���
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("�׷�ä�� [" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
	}

	public void setup() { // ����

		try {
			xGroup = InetAddress.getByName(host); // ip : 230.1.1.1
			ms = new MulticastSocket(port); // post : 7777

			ms.joinGroup(xGroup); // ���� xGrop, ms�� ������ �׷쿡 ����

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void disConnection() { // ���� ����

		try {
			ms.leaveGroup(xGroup); // �׷쿡�� ��������
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
				
				ms.receive(dp); // ����
				String msg = new String(dp.getData()).trim(); // byte�� String���� ��ȯ
				ta.append(msg + "\r\n"); // ���
			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnection(); // ���� ����
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String msg = tf.getText().trim();

		if (msg.equals("")) {
			return;
		}

		byte[] buffer = (userName + "]" + msg).getBytes(); // String�� Byte�� �����ؼ� buffer�� ����

		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			ms.send(dp); // ����

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