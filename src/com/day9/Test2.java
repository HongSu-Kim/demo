package com.day9;

// 생성자 
// 1. 메모리 할당
// 2. 변수 초기화
// 클래스의 이름과 동일
// 반환값(return)이 없기 때문에 property(void, int, String등)가 없다
// 중복정의가 가능(오버로딩)
// 생성자에서 다른 생성자를 호출가능(단, 맨 선두에서 한번만)

public class Test2 {

	private int x;

	// 생성자를 오버로딩할때는 기본생성자를 만들어줘야한다.
//	public Test2() {} // 기본생성자

	public Test2() {

//		// this(30); // Test2(30);
//
//		System.out.println("기본생성자");
//		x = 10;
//		System.out.println("x : " + x);

	}

	public Test2(int x) { // 생성자 중복 정의

		// this();

//		System.out.println("오버로딩된 생성자");
		this.x = x;
//		System.out.println("x : " + x);

	}

	public void setData(int x) {
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
