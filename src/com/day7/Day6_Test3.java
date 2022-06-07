package com.day7;

import java.util.Scanner;

class D6T3 {

	int[] score, rank;
	String[] name;
	int i, j, inwon;

	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("인원수[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당 (배열 객체생성)85
		name = new String[inwon]; // 기본값 : null
		score = new int[inwon];
		rank = new int[inwon]; // 기본값 : 0

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d번째 사람의 이름 입력 : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d번째 사람의 점수 입력 : ", i + 1);
			score[i] = sc.nextInt();
			rank[i] = 1; // 석차 초기화
		}

	}

	public void rank() {

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

	}

	public void print() {

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d점 %4d등\n", name[i], score[i], rank[i]);
		}

	}

}

public class Day6_Test3 {

	public static void main(String[] args) {

		D6T3 o = new D6T3();
		o.input();
		o.rank();
		o.print();

	}

}
