package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 배열로 만년달력

		Scanner sc = new Scanner(System.in);
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 배열 선언하면서 초기화
		int y, m, i, nalsu = 0, week;

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

		// 1년 1월 1일부터 (y-1)년 12월 31일까지의 날수
		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// (m-1)월 까지의 날수
		for (i = 0; i < m - 1; i++) {
			nalsu += month[i];
		}

		// m월 1일의 날수
		nalsu++;

		week = nalsu % 7;

		System.out.println("\n    " + y + "년 " + m + "월");
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");

		// 특정요일부터 시작하도록 공백 지정
		for (i = 0; i < week; i++) {
			System.out.print("    ");
		}

		// 해당월의 날짜를 출력
		for (i = 1; i <= month[m - 1]; i++) {

			System.out.printf("%4d", i); // %4d : 앞에 공백을 넣어서 4자리로 출력

			week++;

			// 토요일 출력 후 \n
			if (week % 7 == 0) {

				System.out.println();

			}

		}

		// 마지막날이 토요일이 아닐 때 \n
		if (week % 7 != 0) {

			System.out.println();

		}

		System.out.println("------------------------------");

		sc.close();

	}

}
