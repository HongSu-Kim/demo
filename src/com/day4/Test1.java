package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �ݺ���(for, while, do ~ while)

		Scanner sc = new Scanner(System.in);
		int dan;

		System.out.print("���� �Է� ");
		dan = sc.nextInt();

		System.out.println("for��");

		// for (�ʱ�ȭ; ���ǽ�; ������) {}
		// for�� : ���۰��� ������ ������ ����
		for (int i = 1; i <= 9; i++) {

//			System.out.println(dan + " * " + i + " = " + dan * i);
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);

		}

		System.out.println("while��");

		// �ʱ�ȭ
		// while (���ǽ�) {������}
		// while�� : ��� ���������� �𸦶�
		int j = 0;
		while (j < 9) {

			j++;
			System.out.printf("%d * %d = %d\n", dan, j, dan * j);

		}

		System.out.println("do ~ while��");

		// �ʱ�ȭ
		// do {������} while (���ǽ�)
		// do ~ while�� : �ѹ��� ������ �����ؾ� �Ҷ�
		int k = 0;
		do {

			k++;
			System.out.printf("%d * %d = %d\n", dan, k, dan * k);

		} while (k < 9);

		sc.close();

	}

}
