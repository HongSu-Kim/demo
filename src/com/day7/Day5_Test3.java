package com.day7;

import java.util.Scanner;

class D5T3 {

	Scanner sc = new Scanner(System.in);
	int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �迭 �����ϸ鼭 �ʱ�ȭ

	public int inputYear() {
		
		int y;
		do {
			System.out.print("�⵵? ");
			y = sc.nextInt();
		} while (y < 1);

		return y;

	}

	public int inputMonth(int y) {

		int m;
		do {
			System.out.print("���? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		// y���� �������� Ȯ��
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1] = 29;
		}

		return m;

	}

	public int inputDay(int m) {

		int d;
		do {
			System.out.print("����? ");
			d = sc.nextInt();
		} while (d < 1 || d > month[m - 1]);

		return d;

	}

	public int nalsu(int y, int m, int d) {
		// 1�� 1�� 1�Ϻ��� (y-1)�� 12�� 31�ϱ����� ����
		int nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// (m-1)�� ������ ����
		for (int i = 0; i < m - 1; i++) {
			nalsu += month[i];
		}

		return nalsu += d;

	}

	public char yoil(int nalsu) {
		char yoil[] = { '��', '��', 'ȭ', '��', '��', '��', '��' };
		return yoil[nalsu % 7];
	}

	public void print(int y, int m, int d, char yoil) {
		System.out.printf("%d�� %d�� %d�� %c����", y, m, d, yoil);
	}

}

public class Day5_Test3 {

	public static void main(String[] args) {

		D5T3 o = new D5T3();
		int y = o.inputYear();
		int m = o.inputMonth(y);
		int d = o.inputDay(m);
		int nalsu = o.nalsu(y, m, d);
		char yoil = o.yoil(nalsu);
		o.print(y, m, d, yoil);

	}

}
