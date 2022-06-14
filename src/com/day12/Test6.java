package com.day12;

// final을 사용 할수있는 3가지 경우
// 변수에 final을 붙이면 : 한번만 초기화 가능
// 메소드에 final을 붙이면 : Override가 불가능 
// 클래스에 final을 붙이면 : 상속이 불가능

class Super {

	public static final double PI;

	static {
		PI = 3.14; // 더이상 초기화 불가능
	}

	public double area;

	public final void write(String title) { // Override 불가능
		System.out.println(title + " : " + area);
	}

}

public class Test6 extends Super {

	// public void write(String title) {} // Override 불가능

	public void circleArea(int r) {
		area = (double) r * r * PI;
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();

		ob.circleArea(10);
		ob.write("원");

	}

}
