package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է¹޾�
		// ������ ���� ��� ������ ��� (��������)

		int[] scare;
		String[] name;
		Scanner sc = new Scanner(System.in); // new : ��ü����
		int i, j, inwon, temp1;
		String temp2;

		do {
			System.out.print("�ο���[1 ~ 10]? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� �޸� �Ҵ� (�迭 ��ü����)
		name = new String[inwon];
		scare = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.printf("%d��° ����� �̸� �Է� : ", i + 1);
			name[i] = sc.next();
			System.out.printf("%d��° ����� ���� �Է� : ", i + 1);
			scare[i] = sc.nextInt();
		}

		// Selection Sort(����)
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (scare[i] < scare[j]) { // ��������

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
			System.out.printf("%2d�� : %6s %4d��\n", i + 1, name[i], scare[i]);
		}

		sc.close();

	}

}
