package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 만년달력
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		int y, m, i, week;
		char[] w = { '일', '월', '화', '수', '목', '금', '토' };

		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		cal.set(y, m - 1, 1);

		week = cal.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.printf("%d년 %d월\n", y, m);
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
