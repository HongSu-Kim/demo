package com.day9;

public class Test4 {

	int a = 5;

	// �ʱ�ȭ �� : new�� ������ ����ǰ� ���̻� ȣ���Ҽ�����
	{
		System.out.println("�ʱ�ȭ ��a : " + a);
		a = 10;
		System.out.println("�ʱ�ȭ ��a : " + a);
	}

	static int b;
	static { // static ��
		b = 10;
		System.out.println("�ʱ�ȭ ��b : " + b);
	}

	final int C; // ��� : �Ϲ������� �빮�ڷ� ��, �����Ҷ� �ʱ�ȭ�ؾ���, ����Ұ���

	public Test4() { // ������
		System.out.println("������");
		C = 100;
		System.out.println("C : " + C);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Test4 ob1 = new Test4();

		// �������
		// static ����
		// new�� ������ �ʱ�ȭ ��(+ instance ����,�޼ҵ�) ����
		// ������ ����

		Test4 ob2 = new Test4();

	}

}
