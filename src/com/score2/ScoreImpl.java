package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	@Override
	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("학번? ");
			rec[i].hak = sc.next();
			System.out.print("이름? ");
			rec[i].name = sc.next();
			System.out.print("국어? ");
			rec[i].kor = sc.nextInt();
			System.out.print("영어? ");
			rec[i].eng = sc.nextInt();
			System.out.print("수학? ");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].ave = rec[i].tot / 3;

		}

	}

	private String pan(int score) {

		if (score >= 90)
			return "수";
		else if (score >= 80)
			return "우";
		else if (score >= 70)
			return "미";
		else if (score >= 60)
			return "양";
		else
			return "가";

	}

	@Override
	public void prinr() {

		for (int i = 0; i < inwon; i++) {
			System.out.printf("학번 :%6s, 이름 :%6s\n", rec[i].hak, rec[i].name);
			System.out.printf("국어 :%4d(%s), 영어 :%4d(%s), 수학 :%4d(%s)\n", rec[i].kor, pan(rec[i].kor), rec[i].eng,
					pan(rec[i].eng), rec[i].mat, pan(rec[i].mat));
			System.out.printf("총점 :%4d, 평균 :%4d\n", rec[i].tot, rec[i].ave);
		}

	}

}
