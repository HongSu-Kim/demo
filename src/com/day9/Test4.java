package com.day9;

public class Test4 {

	int a = 5;

	// 초기화 블럭 : new를 만날떄 실행되고 더이상 호출할수없음
	{
		System.out.println("초기화 블럭a : " + a);
		a = 10;
		System.out.println("초기화 블럭a : " + a);
	}

	static int b;
	static { // static 블럭
		b = 10;
		System.out.println("초기화 블럭b : " + b);
	}

	final int C; // 상수 : 일반적으로 대문자로 씀, 선언할때 초기화해야함, 변경불가능

	public Test4() { // 생성자
		System.out.println("생성자");
		C = 100;
		System.out.println("C : " + C);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Test4 ob1 = new Test4();

		// 실행순서
		// static 실행
		// new를 만나서 초기화 블럭(+ instance 변수,메소드) 실행
		// 생성자 실행

		Test4 ob2 = new Test4();

	}

}
