package com.day7;

// 일반적으로는 1file : 1class이지만 경우에 따라서는 class를 여러개 만들어줄수도있다.
// 두 class가 밀접한 관계가있어서 두 class를 항상(거의) 같이 사용하는 경우

// 하나의 file에 여러 class를 사용할경우 public을 생략한다. 
class Sub {

	int a, b;

}

public class Test2 {

	public static void main(String[] args) {

		Sub ob1 = new Sub();
		Sub ob2 = new Sub();

		System.out.println("ob1.a : " + ob1.a);
		System.out.println("ob1.b : " + ob1.b);

		ob1.a = 10;
		ob1.b = 20;
		System.out.println("ob1.a : " + ob1.a);
		System.out.println("ob1.b : " + ob1.b);

		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob2.a : " + ob2.a);
		System.out.println("ob2.b : " + ob2.b);

		System.out.println("ob1.a : " + ob1.a);
		System.out.println("ob1.b : " + ob1.b);

	}

}
