package com.day17;

// 인터럽트 : 우선순위가 높은 프로그램을 먼저 실행 시키고 다시 돌아옴

class MyThread7 extends Thread {

	private Thread next;

	public void setNext(Thread next) {
		this.next = next;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				sleep(2000); // 2.sleep()에 의해 (2초 동안) 일시정지 상태가 됨 // 6.다시 일시정지 상태가 됨
			} catch (Exception e) {
			}

			System.out.println(getName() + " : " + i); // 4.실행대기 상태가 되면 출력

			if (next.isAlive()) {
				next.interrupt(); // 5. 다음스레드(t2)를 실행대기 상태로 만듦

			}

		}

	}
}

public class Test7 {

	public static void main(String[] args) {

		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();

		t1.setNext(t2);
		t2.setNext(t3);
		t3.setNext(t1);

		t1.start(); // 1.run()이 실행됨
		t2.start();
		t3.start();

		t1.interrupt(); // 3.일시정시 상태의 t1을 실행대기 상태로 만듦

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("main 종료...");

	}

}
