package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// ���� �Է¹޾� 1�������� �������� �հ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su, sum;
		char ch;

		while (true) { // ���ѷ���

			do {
				System.out.print("���� �Է� : ");
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {

				sum += i;

			}
			System.out.printf("1~ %d������ �� : %d\n", su, sum);

			do {
				System.out.print("���? [Y/N] : "); // y\n\r �Է½� \n\r�� ����
				ch = (char) System.in.read();
				System.in.skip(2); // ���� \n\r�� ������
			} while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');

			if (ch == 'N' || ch == 'n') { // ch != 'Y' && ch != 'y'

				System.out.println("���α׷� ����!!");
				break; // �ݺ����� �������� // while, do ~ while, for, switch�� ���

			}

		}

	}

}
