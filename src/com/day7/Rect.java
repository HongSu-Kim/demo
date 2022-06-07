package com.day7;

import java.util.Scanner;

public class Rect {

	// 객체(인스턴스) 생성시 전역변수는 각각 만들어준다.
	int w, h; // 전역변수, instance 변수 : 초기화를 하지않으면 초기값(int는 0)이 자동으로 들어간다.

	
	// 메소드 영역은 따로 만들어서 서로 공유한다.
	// 입력
	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// int w, h; // 지역변수 : input() 내에서만 사용가능

		System.out.print("가로? ");
		w = sc.nextInt();
		System.out.print("세로? ");
		h = sc.nextInt();

//		sc.close(); // 메소드는 모든 인스터스가 공유하기 때문에 close를 하게되면 input을 다시하게됐을떄 오류가 발생한다.
		// return; // void는 보통 return을 생략함

	}

	// 넓이 구하기
	public int area() {

		int result;

		result = w * h;

		return result;

	}

	// 둘레 구하기
	public int length() {

		return (w + h) * 2;

	}

	// 출력
	public void print(int a, int l) {

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);

	}

}
