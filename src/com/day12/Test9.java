package com.day12;

class TestA {
	public void print() {
		System.out.println("TestA Ŭ����");
	}
}

class TestB {
	public void print() {
		System.out.println("TestB Ŭ����");
	}
}

public class Test9 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b = new TestB();

		// b = a; // �ڷ����� �ٸ��� ������ �����Ҽ�����.
		// b = (TestB)a;

	}

}
