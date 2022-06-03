package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// �迭�� ����޷�

		Scanner sc = new Scanner(System.in);
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �迭 �����ϸ鼭 �ʱ�ȭ
		int y, m, i, nalsu = 0, week;

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

		// 1�� 1�� 1�Ϻ��� (y-1)�� 12�� 31�ϱ����� ����
		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// (m-1)�� ������ ����
		for (i = 0; i < m - 1; i++) {
			nalsu += month[i];
		}

		// m�� 1���� ����
		nalsu++;

		week = nalsu % 7;

		System.out.println("\n    " + y + "�� " + m + "��");
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		// Ư�����Ϻ��� �����ϵ��� ���� ����
		for (i = 0; i < week; i++) {
			System.out.print("    ");
		}

		// �ش���� ��¥�� ���
		for (i = 1; i <= month[m - 1]; i++) {

			System.out.printf("%4d", i); // %4d : �տ� ������ �־ 4�ڸ��� ���

			week++;

			// ����� ��� �� \n
			if (week % 7 == 0) {

				System.out.println();

			}

		}

		// ���������� ������� �ƴ� �� \n
		if (week % 7 != 0) {

			System.out.println();

		}

		System.out.println("------------------------------");

		sc.close();

	}

}
