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
	private String host = "localhost"; // ����ip // localhost : (127.0.0.1), (10.10.6.97)

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

		setTitle("ä�� Ŭ���̾�Ʈ");
		setSize(300, 400);
		setVisible(true);

	}

	@Override
	public void run() { // �޼��� �ޱ�

		String msg;

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream())); // sc�� ������ ������ br�� ����

			while ((msg = br.readLine()) != null) {
				ta.append("\r\n" + msg);
			}

		} catch (Exception e) {
			ta.append("\r\n���� ���� ����...");
			sc = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // �޼��� ������

		String msg = tf.getText();
		if (msg.trim().equals("")) { // �������� �� ���ڿ� ���� ""�̸� �Ⱥ���
			return;
		}

		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true); // true : flush�� ���� ���

			pw.println("��ȫ��]" + msg); // ������ msg ����

			ta.append("\r\n��ȫ��] " + msg); // �� â�� msg ���
			tf.setText(""); // TextField ����
			tf.requestFocus(); // TextField ��Ŀ��

		} catch (Exception e2) {
			ta.append("\r\n������ ���� ����...");
			sc = null;
		}

	}

	public void connect() {

		try {

			sc = new Socket(host, port); // ip�� port�� ���Ͽ� �ְ� ���� // ���ӽõ�

			Thread th = new Thread(this);
			th.start(); // Client�� ä���� �ޱ����ؼ� Thread�� ����

		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {

		new ClientTest().connect();

	}

}
