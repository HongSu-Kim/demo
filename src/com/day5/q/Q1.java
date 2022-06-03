package com.day5.q;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
//		   가장 큰수와 적은수를 출력

		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i, temp;

		System.out.print("5개의 정수를 입력 : ");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.print("입력받은 수 : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		for (i = 1; i < num.length; i++) {
			if (num[0] < num[i]) {
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		} // num[0] : 가장 큰수

		for (i = 2; i < num.length; i++) {
			if (num[1] > num[i]) {
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
		} // num[1] : 가장 작은수

		System.out.printf("가장 큰 수는 %d, 가장 작은 수는 %d", num[0], num[1]);

		sc.close();

	}

}
