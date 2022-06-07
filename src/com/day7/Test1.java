package com.day7;

public class Test1 {

	public static void main(String[] args) {

		// public : 접근지정자 (public, private 등)
		// return : 리턴값 (void, String, int 등)
		// 매개변수 : (String, int, class 등)
		// new : (클래스를 복사해서) 객체 생성

		Rect ob1 = new Rect(); // ob1에는 변조변수가 저장된다.

		ob1.input();

		int a = ob1.area();
		int l = ob1.length();

		ob1.print(a, l);
		
		Rect ob2 = new Rect();
		ob2.input();
		a = ob2.area();
		l = ob2.length();
		ob2.print(a, l);

	}

}
