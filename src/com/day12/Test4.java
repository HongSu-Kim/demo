package com.day12;

class Test {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("부모 클래스 write()...");
		System.out.println("a : " + a + ", b  : " + b);
	}

}

class Demo extends Test {

	protected int b = 30, c = 40;

	@Override
	public void write() {
		System.out.println("자식 클래스 write()...");
		System.out.println("a : " + a + ", b  : " + b + ", c : " + c);
		System.out.println("super.b : " + super.b);
	}

	public void print1() {
		System.out.println("자식 클래스 print1()...");
		write();
	}

	public void print2() {
		System.out.println("자식 클래스 print2()...");
		super.write();
	}

}

public class Test4 {

	public static void main(String[] args) {

		Demo ob = new Demo();

		ob.write();
		ob.print1();
		ob.print2();

		System.out.println(ob.b); // 30
		// System.out.println(super.b);

		System.out.println(((Test) ob).b); // 20 // UPCAST

		((Test) ob).write();

	}

}
