package com.day4.q;

public class Q6 {

	public static void main(String[] args) {

//		int i, j, k, n = 2, m = 5;
//
//		for (i = 0; i <= 1; i++) { // 2번 실행
//
//			for (j = 1; j <= 9; j++) { // 1~9까지 실행
//
//				for (k = n; k <= m; k++) {
//					System.out.print(k + "*" + j + "=" + (k * j) + "\t");
//				}
//
//				System.out.println(); // 4개 찍고 줄바꿈
//			}
//			System.out.println(); // 6단부터 줄바꿈
//			n = 6;
//			m = 9;
//		}

		for (int dan = 2; dan < 9; dan += 4) {

			for (int i = 1; i <= 9; i++) {

				for (int j = dan; j <= dan + 3; j++) {

					System.out.printf("%d * %d = %d		", j, i, j * i);

				}

				System.out.println();

			}

			System.out.println();

		}
		
//		int i, j, dan;
//
//		for (int k = 0; k < 2; k++) { // 2번 실행
//
//			for (i = 1; i <= 9; i++) { // 1~9까지 실행
//
//				for (j = 2; j <= 5; j++) {
//
//					dan = j + k * 4;
//					System.out.printf("%2d*%2d=%2d\t", dan, i, dan * i);
//				}
//
//				System.out.println(); // 4개 찍고 줄바꿈
//			}
//			System.out.println(); // 6단부터 줄바꿈
//
//		}

	}

}
