package com.score1;

import java.util.Scanner;

public class Score {

	int inwon; // int : 1���� ��(int)�� �����Ҽ��ִ� �ڷ���
	// int[] inwon; // n���� int ���� �����Ҽ��ִ� �ڷ���
	// Record rec; // Record : 7���� ��(String 1��, int[3] 1��, int 3��)�� �����Ҽ��ִ� �ڷ���
	Record[] rec; // n���� Record ���� �����Ҽ��ִ� �ڷ���
	String[] title = { "����", "����", "����" };

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon]; // rec�� 3���� Record ���� �����Ҽ�����

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record(); // rec[i]�� Record ���� �����Ҽ�����

			System.out.print("�̸�? ");
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
			rec[i].rank = 1;
		}

		for (i = 0; i < inwon - 1; i++) {
			for (j = i + 1; j < inwon; j++) {

				if (rec[i].tot < rec[j].tot)
					rec[i].rank++;
				else if (rec[i].tot > rec[j].tot)
					rec[j].rank++;

			}
		}

	}

	public void print() {

		ranking(); // �޼ҵ忡�� �޼ҵ� ȣ�Ⱑ��

		for (int i = 0; i < inwon; i++) {

			System.out.printf("�̸� : %6s\n", rec[i].name);
			for (int j = 0; j < title.length; j++) {
				System.out.printf("%s : %3d, ", title[j], rec[i].score[j]);
			}
			System.out.println();
			System.out.printf("���� : %3d, ��� : %3d, ��� : %2d��", rec[i].tot, rec[i].ave, rec[i].rank);
			System.out.println();
		}

	}

}
