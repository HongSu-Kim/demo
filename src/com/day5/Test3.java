package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 년(y), 월(m), 일(d) 입력
		// 2022년 6월 2일 목요일 (요일까지 출력)

		Scanner sc = new Scanner(System.in);
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 배열 선언하면서 초기화
		int y, m, d, i, nalsu = 0, week;
		char yoil[] = { '일', '월', '화', '수', '목', '금', '토' };

		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		} while (y < 1);
		do {
			System.out.print("몇월? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		// y년이 윤년인지 확인
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1] = 29;
		}
		do {
			System.out.print("몇일? ");
			d = sc.nextInt();
		} while (d < 1 || d > month[m - 1]);

		// 1년 1월 1일부터 (y-1)년 12월 31일까지의 날수
		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// (m-1)월 까지의 날수
		for (i = 0; i < m - 1; i++) {
			nalsu += month[i];
		}

		// d일 까지의 날수
		nalsu += d;

		week = nalsu % 7;

		System.out.printf("%d년 %d월 %d일 %c요일", y, m, d, yoil[week]);

		sc.close();

	}

}
