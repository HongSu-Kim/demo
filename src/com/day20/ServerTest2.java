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
			System.out.println("서버시작!!");

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

				// 나를 제외한 다른 클라이언트에게 접속 사실을 알림
				msg = ip + "] 가 입장 했습니다.";
				for (Socket s : clients) {

					if (s == sc) { // clients == 나
						continue; // 이번만 패스 (for문으로 돌아감)
					}

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

					pw.println(msg);

				}

				System.out.println(msg); // 서버에 출력

				// 메세지 보내기
				while ((msg = br.readLine()) != null) {
					for (Socket s : clients) {

						if (s == sc) {
							continue; // 이번만 패스 (for문으로 돌아감)
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

						pw.println(msg);

					}
					System.out.println(msg); // 서버에 출력
				}

			} catch (Exception e) {

				msg = ip + "]가 퇴장했습니다.";

				try {

					for (Socket s : clients) {

						if (s == sc) {
							continue; // 이번만 패스 (for문으로 돌아감)
						}

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

						pw.println(msg);

					}

					System.out.println(msg); // 서버에 출력
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