package com.day4.q;

public class Q2 {

	public static void main(String[] args) {

//		2. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
//		¦���� : 2550
//		Ȧ���� : 2500
//		�� : 5050

		int n = 0, sum1 = 0, sum2 = 0, sum3 = 0;

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum1 += i;
//			}
//		}
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				sum2 += i;
//			}
//		}
//
//		for (int i = 1; i <= 100; i++) {
//			sum3 += i;
//		}

		while (n < 100) {
			if (n % 2 == 0) {
				sum1 += n;
			} else {
				sum2 += n;
			}
			sum3 += n;
		}

		System.out.println("¦���� �� : " + sum1);
		System.out.println("Ȧ���� �� : " + sum2);
		System.out.println("�� : " + sum3);

	}

}
