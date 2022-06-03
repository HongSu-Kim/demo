package com.day3;

import java.util.Scanner;

public class Test6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Scanner : 단락문자의 패턴을 사용해 구분
		// 기본 단락의 공백

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		// System.out.print(" 이름 국어 영어 수학? "); // suzi 50 70 80
		System.out.print(" 이름,국어,영어,수학? "); // suzi,50,70,80

		// sc = new Scanner(sc.next()) : sc 전체를 다시 불러옴
		// useDelimiter : 패턴을 설정, 기본은 공백
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + " : " + (kor + eng + mat) + "점");

		sc.close();

	}

}
