package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է¹޾�
		// ���� ���ϱ�

		int[] score, rank;
		String[] name;
		Scanner sc = new Scanner(System.in); // new : ��ü����
		int i, j, inwon;
		

		do {
			System.out.print("�ο���[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� �޸� �Ҵ� (�迭 ��ü����)85
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d��° ����� �̸� �Է� : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d��° ����� ���� �Է� : ", i + 1);
			score[i] = sc.nextInt();
			rank[i] = 1; // ���� �ʱ�ȭ
		}

		// �������
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				// ���� score�� rank�� +1����
				if (score[i] < score[j]) {
					rank[i]++;
				} else if (score[i] > score[j]) {
					rank[j]++;
				}

			}

		}

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d�� %4d��\n", name[i], score[i], rank[i]);
		}

		sc.close();

	}

}
