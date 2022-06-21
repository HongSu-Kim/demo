package com.day17;

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {

		int i = 0;
		while (i < num) {

			System.out.println(this.getName() + " : " + name + i);
			i++;

			try {
				sleep(100); // 1000 : 1초
			} catch (Exception e) {
			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main 시작...");

		MyThread1 t1 = new MyThread1(100, "첫번째 : "); // 자식클래스를 이용하여 객체를 생성한다.

		Thread t2 = new MyThread1(200, "두번째 : "); // 보통은 SubThread 객체로 생성하지만 SubThread의 메소드가 없거나 사용하지 않을때는 Thread 객체로
													// 생성해주어도 된다.

		t1.start(); // start() : run() 메소드 실행
		t2.start();

		System.out.println("main 종료...");

	}

}
