package com.day13;

// 3. 내부클래스(중첩)(Static)

class Outer3 {

	static int a = 10;
	int b = 20;

	public static class Inner3 {

		int c = 30;

		public void write() {

			System.out.println(a);
			// System.out.println(b); // Inner3은 static이기때문에 Outer3이 생성되기전에도 메모리에 올라가서 사용이
			// 가능하다.
			System.out.println(c);

			Outer3 ob = new Outer3(); // Inner3 내부에서 Outer3을 생성가능하다.
			System.out.println(ob.b);

		}

	}

}

public class Test6 {

	public static void main(String[] args) {

//		Outer3 out = new Outer3(); // Inner3이 static이기때문에 Outer3을 생성하지않아도 Inner3을 생성 가능하다.

		Outer3.Inner3 inner = new Outer3.Inner3();
		inner.write();

	}

}
