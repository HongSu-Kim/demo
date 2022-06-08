package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아
		// 점수가 높은 사람 순으로 출력 (내림차순)

		int[] scare;
		String[] name;
		Scanner sc = new Scanner(System.in); // new : 객체생성
		int i, j, inwon, temp1;
		String temp2;

		do {
			System.out.print("인원수[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당 (배열 객체생성)
		name = new String[inwon];
		scare = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d번째 사람의 이름 입력 : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d번째 사람의 점수 입력 : ", i + 1);
			scare[i] = sc.nextInt();
		}

		// Selection Sort(정렬)
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (scare[i] < scare[j]) { // 내림차순

					temp1 = scare[i];
					scare[i] = scare[j];
					scare[j] = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;

				}

			}

		}

		for (i = 0; i < inwon; i++) {
			System.out.printf("%2d등 : %6s %4d점\n", i + 1, name[i], scare[i]);
		}

		sc.close();

	}

}
