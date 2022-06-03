package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아
		// 석차 구하기

		int[] score, rank;
		String[] name;
		Scanner sc = new Scanner(System.in); // new : 객체생성
		int i, j, inwon;
		

		do {
			System.out.print("인원수[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당 (배열 객체생성)85
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d번째 사람의 이름 입력 : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d번째 사람의 점수 입력 : ", i + 1);
			score[i] = sc.nextInt();
			rank[i] = 1; // 석차 초기화
		}

		// 석차계산
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				// 낮은 score의 rank에 +1해줌
				if (score[i] < score[j]) {
					rank[i]++;
				} else if (score[i] > score[j]) {
					rank[j]++;
				}

			}

		}

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d점 %4d등\n", name[i], score[i], rank[i]);
		}

		sc.close();

	}

}
