package com.score1_2;

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

		// �迭 ����
		rec = new Record[inwon]; // rec�� inwon���� Record ���� �����Ҽ�����

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
			for (j = 0; j < 3; j++) {

				if (rec[i].score[j] >= 90)
					rec[i].ch[j] = '��';
				else if (rec[i].score[j] >= 80)
					rec[i].ch[j] = '��';
				else if (rec[i].score[j] >= 70)
					rec[i].ch[j] = '��';
				else if (rec[i].score[j] >= 60)
					rec[i].ch[j] = '��';
				else
					rec[i].ch[j] = '��';
			}
		}

	}

	public void print() {

		ranking(); // �޼ҵ忡�� �޼ҵ� ȣ�Ⱑ��

		for (int i = 0; i < inwon; i++) {

			System.out.printf("�̸� : %6s\n", rec[i].name);
			for (int j = 0; j < title.length; j++) {
				System.out.printf("%s : %3d(%c), ", title[j], rec[i].score[j], rec[i].ch[j]);
			}
			System.out.println();
			System.out.printf("���� : %3d, ��� : %3d", rec[i].tot, rec[i].ave);
			System.out.println();
		}

	}

}
