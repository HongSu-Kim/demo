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
	private ServerSocket ss = null; // ������ �� ���� �� �ʿ�
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

		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);

	}

	@Override
	public void run() { // �޼��� �ޱ�

		String msg;
		String ip;

		try {
			if (sc == null) { // sc�� null�̸� Ŭ���̾�Ʈ�� ������ ���� ����
				return;
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream())); // sc�� ������ ������ br�� ����

			ip = sc.getInetAddress().getHostAddress(); // Client IP
			ta.append("\r\n[" + ip + "] ����!"); //

			while ((msg = br.readLine()) != null) {
				ta.append("\r\n" + msg);
			}

		} catch (Exception e) {
			ta.append("\r\nŬ���̾�Ʈ ���� ����...");
			sc = null; // ������ ���� ���� �ʰ� �����
			ss = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // �޼��� ������

		String msg = tf.getText();
		if (msg.trim().equals("")) { // �������� �� ���ڿ� ���� ""�̸� �Ⱥ���
			return;
		}

		if (sc == null) { // Client�� �����ӽ�
			return;
		}

		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true); // true : flush�� ���� ���

			pw.println("����]" + msg); // Ŭ���̾�Ʈ�� ����

			ta.append("\r\n����] " + msg); // �� â�� ���
			tf.setText(""); // TextField ����
			tf.requestFocus(); // TextField ��Ŀ��

		} catch (Exception e2) {
			ta.append("\r\nŬ���̾�Ʈ�� ���� ����...");
			sc = null;
		}

	}

	public void serverStart() {

		try {

			ss = new ServerSocket(7777); // 7777 : ServerPort
			ta.setText("��������!!");

			sc = ss.accept(); // Server�� Client�� ����

			Thread th = new Thread(this);
			th.start(); // Client�� ä���� �ޱ����ؼ� Thread�� ����

		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {

		new ServerTest().serverStart();

	}

}
