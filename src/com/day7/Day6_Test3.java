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
			System.out.print("�ο���[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� �޸� �Ҵ� (�迭 ��ü����)85
		name = new String[inwon]; // �⺻�� : null
		score = new int[inwon];
		rank = new int[inwon]; // �⺻�� : 0

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d��° ����� �̸� �Է� : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d��° ����� ���� �Է� : ", i + 1);
			score[i] = sc.nextInt();
			rank[i] = 1; // ���� �ʱ�ȭ
		}

	}

	public void rank() {

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

	}

	public void print() {

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d�� %4d��\n", name[i], score[i], rank[i]);
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
