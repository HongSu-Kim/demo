package com.day13;

// 1. 내부클래스(Inner)

class Outer1 {

	static int a = 10;
	int b = 20;

	public class Inner1 {

		int c = 30;

		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

	public void print() {

		System.out.println("print()...");

		Inner1 ob = new Inner1();
		ob.write();

	}

}

public class Test4 {

	public static void main(String[] args) {

		// 외부클래스가 객체가 생성이 되어야 내부클래스의 객체를 생성할수있고
		// 외부클래스의 객체가 생성되었다고해서 자동으로 내부클래스의 객체가 생성되는것은 아니다.

		Outer1 out = new Outer1();
		out.print();

		Outer1.Inner1 inner = out.new Inner1();
		inner.write();

	}

}
