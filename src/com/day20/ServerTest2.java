package com.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerTest2 {

	private List<Socket> clients = new ArrayList<Socket>();

	public void serverStart() {

		try {

			@SuppressWarnings("resource")
			ServerSocket ss = new ServerSocket(7777); // 7777 : ServerPort
			System.out.println("��������!!");

			while (true) {

				Socket sc = ss.accept();

				WorkerThread th = new WorkerThread(sc);
				th.start();

			}

		} catch (Exception e) {
		}

	}

	class WorkerThread extends Thread {

		private Socket sc;

		public WorkerThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();
				clients.add(sc);

				// ���� ������ �ٸ� Ŭ���̾�Ʈ���� ���� ����� �˸�
				msg = ip + "] �� ���� �߽��ϴ�.";
				for (Socket s : clients) {

					if (s == sc) { // clients == ��
						continue; // �̹��� �н� (for������ ���ư�)
					}

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

					pw.println(msg);

				}

				System.out.println(msg); // ������ ���

				// �޼��� ������
				while ((msg = br.readLine()) != null) {
					for (Socket s : clients) {

						if (s == sc) {
							continue; // �̹��� �н� (for������ ���ư�)
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

						pw.println(msg);

					}
					System.out.println(msg); // ������ ���
				}

			} catch (Exception e) {

				msg = ip + "]�� �����߽��ϴ�.";

				try {

					for (Socket s : clients) {

						if (s == sc) {
							continue; // �̹��� �н� (for������ ���ư�)
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

						pw.println(msg);

					}

					System.out.println(msg); // ������ ���
					sc = null;

				} catch (IOException e1) {
				}
			}

		}

	}

	public static void main(String[] args) {

		new ServerTest2().serverStart();

	}

}