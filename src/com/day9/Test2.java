package com.day9;

// ������ 
// 1. �޸� �Ҵ� (��ü ����)
// 2. ���� �ʱ�ȭ (Ŭ���� �ʱ�ȭ : ����������)
// Ŭ������ �̸��� ����
// ��ȯ��(return)�� ���� ������ property(void, int, String��)�� ����
// �ߺ����ǰ� ����(�����ε�)
// �����ڿ��� �ٸ� �����ڸ� ȣ�Ⱑ��(��, �� ���ο��� �ѹ���)

public class Test2 {

	private int x;

	// �����ڸ� �����ε��Ҷ��� �⺻�����ڸ� ���������Ѵ�.
//	public Test2() {} // �⺻������

	public Test2() {

//		// this(30); // Test2(30);
//
//		System.out.println("�⺻������");
//		x = 10;
//		System.out.println("x : " + x);

	}

	public Test2(int x) { // ������ �ߺ� ����

		// this();

//		System.out.println("�����ε��� ������");
		this.x = x;
//		System.out.println("x : " + x);

	}

	public void setData(int x) { // private ������ �ʱ�ȭ
		this.x = x;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Test2 ob1 = new Test2();

		System.out.println(ob1.x); // 0
		ob1.setData(100);
		System.out.println(ob1.x); // 100

		// -------------------------------------

		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x); // 20

		Test2 ob3 = new Test2();
		Test2 ob4 = new Test2(60);

	}

}
