package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// ������ �������� x���� ��-��-�� ����
		// �⵵? 2022
		// ��? 6
		// ��? 14
		// ������? 100
		// ������ : 2022�� 6�� 14�� ȭ����
		// 100���� : ...........

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int y, m, d, w, n;
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		do {
			System.out.print("�⵵? ");
			y = sc.nextInt();
		} while (y < 1);
		do {
			System.out.print("��? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		cal.set(y, m-1, Calendar.DATE);
		do {
			System.out.print("��? ");
			d = sc.nextInt();
		} while (d < 1 || d > cal.getActualMaximum(Calendar.DATE));
		do {
			System.out.print("��ĥ��? ");
			n = sc.nextInt();
		} while (n < 1);
		sc.close();

		cal.set(y, m - 1, d);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MARCH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.printf("������ : %d�� %d�� %d�� %s����\n", y, m, d, week[w]);
		
		cal.add(Calendar.DATE, n);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MARCH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.printf("%d���� : %d�� %d�� %d�� %s����", n, y, m, d, week[w]);

	}

}
