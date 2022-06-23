package com.day17;

// ������ �����ֱ�

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("������ ����...");

			System.out.println("�켱���� : " + getPriority());
			System.out.println("������ �̸� : " + getName());

			// 0.5��
			sleep(500);

			// �켱����
			setPriority(2);
			System.out.println("����� �켱���� : " + getPriority());

			System.out.println("������ ����...");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // main
		Thread t2 = new MyThread6(); //

		System.out.println("���ν����� �켱���� : " + t1.getPriority()); // 5
		System.out.println("���ν����� �̸� : " + t1.getName()); // main

		System.out.println("t2.strat�޼ҵ� ȣ���� isAlive : " + t2.isAlive()); // false

		t2.start();

		// t2�� �켱����
		System.out.println("t2 �켱���� : " + t2.getPriority());

		t2.setPriority(1);

		try {

			Thread.sleep(100);

			System.out.println("t2 ����ֳ�? : " + t2.isAlive());

			Thread.sleep(1000);

			System.out.println("1�� ���� t2 ����ֳ�? : " + t2.isAlive());

			t2.join();

			System.out.println("t2 �׷��� ����ֳ�? : " + t2.isAlive());

		} catch (Exception e) {
		}

		System.out.println("main ����...");

	}

}