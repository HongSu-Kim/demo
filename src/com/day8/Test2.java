package com.day8;

// static
// 알아서 메모리에 올라감(메모리 할당을 받음)
// 객체를 1000번 생성해도 메모리 공간은 1개

public class Test2 {

	public static int a = 10; // class 변수
	// 클래스 변수(, 메소드) : 클래스가 로딩되는 순간 메모리 할당이 됨
	// [클래스이름.객체] 를 통해 접근 가능
	// 즉, new를 통해 메모리 할당을 받지 않아도 사용 가능하다.

	public int b = 20; // instance 변수
	// 인스턴스 변수 : new를 통해서 메모리 할당을 받아야만 사용이 가능하고
	// 클래스 메소드에서는 접근이 불가능 하다.

	public void write() { // instance 메소드
		System.out.println("class 변수 : " + a);
		System.out.println("instance 변수 : " + b);
	}

	public static void print() { // class 메소드
		System.out.println("class 변수 : " + a);
		// System.out.println("instance 변수 : " + b); // class 메소드에서는 instance 변수를
		// 호출할수없다.
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// a, print(), main() : 메모리에 올라가있음
		System.out.println("class 변수 : " + a);
		System.out.println("class 변수 : " + Test2.a);
		// System.out.println("instance 변수 : " + b); // 아직 메모리에 b가 올라가지 않아서 출력할수없다.

		// write();
		print();
		Test2.print();

		Test2 ob = new Test2(); // b, write() : 메모리에 올라감

		// static 변수(메소드) : ob(instance 명)로도 불러올수있지만 Test2(class 명)로 불러온다.
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.write();
		ob.print();
		Test2.print();

		System.out.println(ob.a); // 10
		System.out.println(ob.b); // 20

		System.out.println("---------------------");

		Test2 ob1 = new Test2();
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a); // 100
		System.out.println(ob1.b); // 200

		System.out.println("---------------------");

		Test2 ob2 = new Test2();
		System.out.println(ob2.a); // 100
		System.out.println(ob2.b); // 20

		System.out.println("---------------------");

		Test2 ob3 = new Test2();
		System.out.println(ob3.a); // 100
		System.out.println(ob3.b); // 20

	}

}
