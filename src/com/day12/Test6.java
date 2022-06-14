package com.day12;

// final�� ��� �Ҽ��ִ� 3���� ���
// ������ final�� ���̸� : �ѹ��� �ʱ�ȭ ����
// �޼ҵ忡 final�� ���̸� : Override�� �Ұ��� 
// Ŭ������ final�� ���̸� : ����� �Ұ���

class Super {

	public static final double PI;

	static {
		PI = 3.14; // ���̻� �ʱ�ȭ �Ұ���
	}

	public double area;

	public final void write(String title) { // Override �Ұ���
		System.out.println(title + " : " + area);
	}

}

public class Test6 extends Super {

	// public void write(String title) {} // Override �Ұ���

	public void circleArea(int r) {
		area = (double) r * r * PI;
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();

		ob.circleArea(10);
		ob.write("��");

	}

}
