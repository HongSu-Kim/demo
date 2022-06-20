package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 오늘을 기준으로 x일후 년-월-일 요일
		// 년도? 2022
		// 월? 6
		// 일? 14
		// 몇일후? 100
		// 만난날 : 2022년 6월 14일 화요일
		// 100일후 : ...........

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int y, m, d, w, n;
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		} while (y < 1);
		do {
			System.out.print("월? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		cal.set(y, m-1, Calendar.DATE);
		do {
			System.out.print("일? ");
			d = sc.nextInt();
		} while (d < 1 || d > cal.getActualMaximum(Calendar.DATE));
		do {
			System.out.print("며칠후? ");
			n = sc.nextInt();
		} while (n < 1);
		sc.close();

		cal.set(y, m - 1, d);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MARCH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.printf("만난날 : %d년 %d월 %d일 %s요일\n", y, m, d, week[w]);
		
		cal.add(Calendar.DATE, n);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MARCH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.printf("%d일후 : %d년 %d월 %d일 %s요일", n, y, m, d, week[w]);

	}

}
