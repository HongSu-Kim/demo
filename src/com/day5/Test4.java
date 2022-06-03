package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// Selection Sort : 순서대로 정렬

		int num[] = new int[5];
		int i, j, temp;
		Scanner sc = new Scanner(System.in);

		System.out.print("5개의 정수 입력 : ");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.print("Source Data : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		// Selection Sort
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

		System.out.print("Sorted Data : ");
//		for (i = 0; i < num.length; i++) {
//			System.out.printf("%4d", num[i]);
//		}
		// 확장for문 (for each) : 배열구조에서 사용가능, 첫값부터 마지막값까지 순서대로 대입
		for (int su : num) {
			System.out.printf("%4d", su);
		}

		sc.close();

	}

}
