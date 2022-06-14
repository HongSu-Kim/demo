package com.day11;

// Wrapper 클래스
// 기본 자료형을 객체로 사용할수있게 해준다. 

// 기본 자료형
// boolean, byte, char, short, int, float, double

// reference(class) 자료형 // 기본 자료형을 변경하기위한 class
// Boolean, Byte, Character, Short, Integer, Float, Double

// Auto-Boxing : stack -> heap
// Auto-unBoxing : heap -> stack

public class Test7 {

	public static void main(String[] args) {

		int a = 24;

		System.out.println(a + 10); // 34
		System.out.println(Integer.toString(a) + 10); // 2410
		System.out.println(Integer.toString(a, 2)); // 11000 // 2진수로 변경
		System.out.println(Integer.toString(a, 16)); // 18 // 16진수로 변경

		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		num1 = n1; // Auto-Boxing
		n2 = num2; // Auto-unBoxing
		System.out.println(n1 + " : " + num1);
		System.out.println(n2 + " : " + num2);

//
//		int a = 10; float b;
//
//		b = a; // b == 10.0 // 암시적 형변환
//		b = (float)a; // 명시적 형변환
//
//		a = b; // error
//		a = (int)b; // 작은 값에 큰 값에 넣을때는 명시적 형변환을 해야한다.
//
//		------------------------------------------------------------------------
//
//		B(부모) - A(자식)
//
//		B = A; // UPCAST
//		B = (B)A; // 명시적 UPCAST
//		
//		A = B; // error
//		A = (A)B // 명시적 DOWNCAST
//

	}

}
