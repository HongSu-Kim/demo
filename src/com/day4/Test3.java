package com.day4;

public class Test3 {

	public static void main(String[] args) {

		int n, sum;
		sum = 0;

		// 100������ ��
		for (n = 1; n <= 100; n++) {
			sum += n;
		}
		System.out.println("1~ 100������ �� : " + sum);

		sum = 0;

		// Ȧ���� ��
		for (n = 1; n <= 100; n += 2) {
			sum += n;
		}
		System.out.println("Ȧ���� �� : " + sum);

		sum = 0;

		// ¦���� ��
		for (n = 2; n <= 100; n += 2) {
			sum += n;
		}
		System.out.println("¦���� �� : " + sum);

		int cnt = 0;

		// Ȧ���� ����
		for (n = 1; n <= 100; n++) {
			if (n % 2 != 0)
				cnt++;
		}
		System.out.println("Ȧ���� ���� : " + cnt);

	}

}
