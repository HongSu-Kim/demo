package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// ���� �Է¹޾� 1�������� �������� �հ�

		Scanner sc = new Scanner(System.in);
		int su, sum;
		char ch;

		while (true) { // ���ѷ���

			do {
				System.out.print("���� �Է� : ");
				su = sc.nextInt();
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {

				sum += i;

			}
			System.out.printf("1~ %d������ �� : %d\n", su, sum);
			System.out.print("���? [Y/N] : ");
			ch = (char) System.in.read();

			if (ch == 'N' || ch == 'n') { // ch != 'Y' && ch != 'y'

				System.out.println("���α׷� ����!!");
				break; // �ݺ����� �������� // while, do ~ while, for, switch�� ���

			}

		}

		sc.close();

	}

}
