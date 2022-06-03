package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// ��(y), ��(m), ��(d) �Է�
		// 2022�� 6�� 2�� ����� (���ϱ��� ���)

		Scanner sc = new Scanner(System.in);
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �迭 �����ϸ鼭 �ʱ�ȭ
		int y, m, d, i, nalsu = 0, week;
		char yoil[] = { '��', '��', 'ȭ', '��', '��', '��', '��' };

		do {
			System.out.print("�⵵? ");
			y = sc.nextInt();
		} while (y < 1);
		do {
			System.out.print("���? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		// y���� �������� Ȯ��
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1] = 29;
		}
		do {
			System.out.print("����? ");
			d = sc.nextInt();
		} while (d < 1 || d > month[m - 1]);

		// 1�� 1�� 1�Ϻ��� (y-1)�� 12�� 31�ϱ����� ����
		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// (m-1)�� ������ ����
		for (i = 0; i < m - 1; i++) {
			nalsu += month[i];
		}

		// d�� ������ ����
		nalsu += d;

		week = nalsu % 7;

		System.out.printf("%d�� %d�� %d�� %c����", y, m, d, yoil[week]);

		sc.close();

	}

}
