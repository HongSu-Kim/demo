package com.day3.q;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

//		3. �� ���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
//		��) 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, temp;

		System.out.print("�� 4�� �Է� ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if (num1 < num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		} // num1 : ���� ū ��

		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num2 > num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		} // num2 : ���� ���� ��

		System.out.printf("���� ū ���� %d, ���� ���� ���� %d", num1, num2);

		sc.close();

	}

}
