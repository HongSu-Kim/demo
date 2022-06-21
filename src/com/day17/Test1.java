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
				sleep(100); // 1000 : 1��
			} catch (Exception e) {
			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main ����...");

		MyThread1 t1 = new MyThread1(100, "ù��° : "); // �ڽ�Ŭ������ �̿��Ͽ� ��ü�� �����Ѵ�.

		Thread t2 = new MyThread1(200, "�ι�° : "); // ������ SubThread ��ü�� ���������� SubThread�� �޼ҵ尡 ���ų� ������� �������� Thread ��ü��
													// �������־ �ȴ�.

		t1.start(); // start() : run() �޼ҵ� ����
		t2.start();

		System.out.println("main ����...");

	}

}
