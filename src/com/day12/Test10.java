package com.day12;

class SuperTest {

	public int a = 10, b = 20;

	public void write() {
		System.out.println("����Ŭ���� write()...");
	}

	public int hap() {
		return a + b;
	}

}

class SubTest extends SuperTest {

	public int b = 100, c = 200;

	public void print() {
		System.out.println("����Ŭ���� print()...");
	}

	@Override
	public int hap() {
		return a + b + c;
	}

}

public class Test10 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();

		System.out.println("ob1.b : " + ob1.b);

		SuperTest ob2 = ob1; // upcast
//		SuperTest ob2 = (SuperTest)ob1; // ����ȯ ���� ����

		System.out.println("ob2.b : " + ob2.b);

		System.out.println("�� : " + ob2.hap());

		ob2.write();

		((SubTest) ob2).print(); // downcast

	}

}
