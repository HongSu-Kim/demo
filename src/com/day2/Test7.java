package com.day2;

public class Test7 {

	public static void main(String[] args) {

		float f = 0; // 0.0
		double d = 0; // 0.0

		// 반복문
		for (int i = 1; i <= 100000; i++) { // 증가연산자 : i++ == i=i+1

			f = f + 100000; // 1000000000
			d = d + 100000; // 1000000000

		}

		// float은 복잡한 연산을 하게되면 문제가 생길수있다.
		System.out.println("float : " + (f / 10000)); // 100000
		System.out.println("double : " + (d / 10000)); // 100000

	}

}
