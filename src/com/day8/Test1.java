package com.day8;

import java.util.Scanner;

// this : Ŭ����, �ڱ��ڽ�(circle), ME
class Circle {

	private int r;

	public void setData(int r) { // setData(int r, Circle this)
		this.r = r; // this. �ν��Ͻ� ������ ����Ų��.
	}

	public double area() { // area(Circle this)
		return r * r * 3.14;
	}

	public void write(double a) { // write(double a, Circle this)
		System.out.println("������ : " + r);
		System.out.println("���� : " + a);
	}

}

public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		Scanner sc = new Scanner(System.in);

		System.out.print("������? ");
		int r = sc.nextInt();

		// ob.r = 20; // private �̱⶧���� ob.r�� �����Ҽ�����.
		ob.setData(r); // setData()�� ���� ob.r�� �ʱ�ȭ // setData(r, ob)
		double a = ob.area(); // area(ob)
		ob.write(a); // write(a, ob)

		sc.close();

	}

}
