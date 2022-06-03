package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 반복문(for, while, do ~ while)

		Scanner sc = new Scanner(System.in);
		int dan;

		System.out.print("단을 입력 ");
		dan = sc.nextInt();

		System.out.println("for문");

		// for (초기화; 조건식; 증가값) {}
		// for문 : 시작값과 끝값이 정해저 있음
		for (int i = 1; i <= 9; i++) {

//			System.out.println(dan + " * " + i + " = " + dan * i);
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);

		}

		System.out.println("while문");

		// 초기화
		// while (조건식) {증가값}
		// while문 : 몇번 돌려야할지 모를때
		int j = 0;
		while (j < 9) {

			j++;
			System.out.printf("%d * %d = %d\n", dan, j, dan * j);

		}

		System.out.println("do ~ while문");

		// 초기화
		// do {증가값} while (조건식)
		// do ~ while문 : 한번은 무조건 실행해야 할때
		int k = 0;
		do {

			k++;
			System.out.printf("%d * %d = %d\n", dan, k, dan * k);

		} while (k < 9);

		sc.close();

	}

}
