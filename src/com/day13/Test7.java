package com.day13;

// 4. 내부클래스(무명의,익명의, Anonymous 클래스)
// return값에 new 클래스() {메소드}; 가 들어간다

public class Test7 {

	public Object getTitle() {

		// String str = "무명의 클래스";

		return new Object() { // 무명의 클래스

			@Override
			public String toString() { // 무조건 실행
				return "무명의 클래스";
			}

		};

	}

	public static void main(String[] args) {

		Test7 ob = new Test7();
		System.out.println(ob.getTitle());

	}

}
