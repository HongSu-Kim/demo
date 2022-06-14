package com.day12;

class TestA {
	public void print() {
		System.out.println("TestA 클래스");
	}
}

class TestB {
	public void print() {
		System.out.println("TestB 클래스");
	}
}

public class Test9 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b = new TestB();

		// b = a; // 자료형이 다르기 때문에 대입할수없다.
		// b = (TestB)a;

	}

}
