package com.day3.q;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

//		2.�� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
//		��) 20, 30 �Է½� -> ū ���� 30, ���� ���� 20

		Scanner sc = new Scanner(System.in);

		int num1, num2, temp;

		System.out.print("�� 2�� �Է� ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.printf("ū ���� %d, ���� ���� %d", num1, num2);

		sc.close();

	}

}
