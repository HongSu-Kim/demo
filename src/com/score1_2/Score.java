package com.score1_2;

import java.util.Scanner;

public class Score {

	int inwon; // int : 1개의 값(int)을 저장할수있는 자료형
	// int[] inwon; // n개의 int 값을 저장할수있는 자료형
	// Record rec; // Record : 7개의 값(String 1개, int[3] 1개, int 3개)을 저장할수있는 자료형
	Record[] rec; // n개의 Record 값을 저장할수있는 자료형
	String[] title = { "국어", "영어", "수학" };

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열 생성
		rec = new Record[inwon]; // rec에 inwon개의 Record 값을 저장할수있음

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record(); // rec[i]에 Record 값을 저장할수있음

			System.out.print("이름? ");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {

				System.out.print(title[j] + "? ");
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];

			}

			rec[i].ave = rec[i].tot / 3;

		}

	}

	private void ranking() {

		int i, j;

		for (i = 0; i < inwon; i++) {
			for (j = 0; j < 3; j++) {

				if (rec[i].score[j] >= 90)
					rec[i].ch[j] = '수';
				else if (rec[i].score[j] >= 80)
					rec[i].ch[j] = '우';
				else if (rec[i].score[j] >= 70)
					rec[i].ch[j] = '미';
				else if (rec[i].score[j] >= 60)
					rec[i].ch[j] = '양';
				else
					rec[i].ch[j] = '가';
			}
		}

	}

	public void print() {

		ranking(); // 메소드에서 메소드 호출가능

		for (int i = 0; i < inwon; i++) {

			System.out.printf("이름 : %6s\n", rec[i].name);
			for (int j = 0; j < title.length; j++) {
				System.out.printf("%s : %3d(%c), ", title[j], rec[i].score[j], rec[i].ch[j]);
			}
			System.out.println();
			System.out.printf("총점 : %3d, 평균 : %3d", rec[i].tot, rec[i].ave);
			System.out.println();
		}

	}

}
