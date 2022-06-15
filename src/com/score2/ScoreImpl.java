package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	@Override
	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("�й�? ");
			rec[i].hak = sc.next();
			System.out.print("�̸�? ");
			rec[i].name = sc.next();
			System.out.print("����? ");
			rec[i].kor = sc.nextInt();
			System.out.print("����? ");
			rec[i].eng = sc.nextInt();
			System.out.print("����? ");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].ave = rec[i].tot / 3;

		}

	}

	private String pan(int score) {

		if (score >= 90)
			return "��";
		else if (score >= 80)
			return "��";
		else if (score >= 70)
			return "��";
		else if (score >= 60)
			return "��";
		else
			return "��";

	}

	@Override
	public void prinr() {

		for (int i = 0; i < inwon; i++) {
			System.out.printf("�й� :%6s, �̸� :%6s\n", rec[i].hak, rec[i].name);
			System.out.printf("���� :%4d(%s), ���� :%4d(%s), ���� :%4d(%s)\n", rec[i].kor, pan(rec[i].kor), rec[i].eng,
					pan(rec[i].eng), rec[i].mat, pan(rec[i].mat));
			System.out.printf("���� :%4d, ��� :%4d\n", rec[i].tot, rec[i].ave);
		}

	}

}
