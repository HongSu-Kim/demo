package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ����޷�
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		int y, m, i, week;
		char[] w = { '��', '��', 'ȭ', '��', '��', '��', '��' };

		do {
			System.out.print("�⵵? ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("��? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		cal.set(y, m - 1, 1);

		week = cal.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.printf("%d�� %d��\n", y, m);
		for (i = 0; i < 7; i++) {
			System.out.printf("  %c", w[i]);
		}
		System.out.println();
		for (i = 0; i < week; i++)
			System.out.print("    ");
		for (i = 0; i < cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i + 1);
			week++;
			if (week % 7 == 0)
				System.out.println();
		}

		sc.close();

	}

}