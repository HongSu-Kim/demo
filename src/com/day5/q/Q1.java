package com.day5.q;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
//		   ���� ū���� �������� ���

		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i, temp;

		System.out.print("5���� ������ �Է� : ");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.print("�Է¹��� �� : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		for (i = 1; i < num.length; i++) {
			if (num[0] < num[i]) {
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		} // num[0] : ���� ū��

		for (i = 2; i < num.length; i++) {
			if (num[1] > num[i]) {
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
		} // num[1] : ���� ������

		System.out.printf("���� ū ���� %d, ���� ���� ���� %d", num[0], num[1]);

		sc.close();

	}

}
