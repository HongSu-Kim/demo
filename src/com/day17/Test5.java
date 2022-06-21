package com.day17;

// Demon 스레드
// 다른스레드에 도움을 주는 스레드로 다른스레드(main)이 종료되면 데몬스레드가 작업을 완료하지 않아도 종료된다. 

class MyThread5 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

public class Test5 {

	public static void main(String[] args) {

		System.out.println("main 시작...");

		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());

		// 데몬스레드
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			t1.join(); // t1이 종료될때까지 기다림
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("main 종료...");

	}
}
