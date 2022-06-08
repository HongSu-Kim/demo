package com.day8;

import java.util.Scanner;

// this : 클래스, 자기자신(circle), ME
class Circle {

	private int r;

	public void setData(int r) { // setData(int r, Circle this)
		this.r = r; // this. 인스턴스 변수를 가리킨다.
	}

	public double area() { // area(Circle this)
		return r * r * 3.14;
	}

	public void write(double a) { // write(double a, Circle this)
		System.out.println("반지름 : " + r);
		System.out.println("넓이 : " + a);
	}

}

public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름? ");
		int r = sc.nextInt();

		// ob.r = 20; // private 이기때문에 ob.r에 접근할수없다.
		ob.setData(r); // setData()를 통해 ob.r을 초기화 // setData(r, ob)
		double a = ob.area(); // area(ob)
		ob.write(a); // write(a, ob)

		sc.close();

	}

}
