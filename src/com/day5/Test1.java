package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 배열
		// 한번 선언하면 늘리거나 줄일수없다.

		int[] num = new int[5]; // int num[] = new int[5]; // num[0] ~ num[4]
		Scanner sc = new Scanner(System.in);

//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		// num[5] = 60; // ArrayIndexOutOfBoundsException : 배열 범위값을 벗어났다는 오류
		System.out.print(num.length + "개의 정수? : "); // .length : 배열 크기
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("배열의 갯수 : " + num.length + "개"); // 배열의 .length에만 ()가 없음

//		System.out.println("num[0] : " + num[0]);
//		System.out.println("num[1] : " + num[1]);
//		System.out.println("num[2] : " + num[2]);
//		System.out.println("num[3] : " + num[3]);
//		System.out.println("num[4] : " + num[4]);
		for (int i = 0; i < num.length; i++) { // 배열은 for문과 같이 쓰는 경우가 많음
			System.out.println("num[" + i + "] : " + num[i]);
		}

		num[3] = 400;
		System.out.println("num[3] : " + num[3]);

		int su = num[1];
		System.out.println(su + " : " + num[1]);

		num[4] = num[0] + num[1];
		System.out.println("num[4] : " + num[4]);

		sc.close();

	}

}
