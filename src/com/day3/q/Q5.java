package com.day3.q;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		5.�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
//		�������� ������ �����ϴ�.
//		10�� �̻� -> 10%
//		20�� �̻� -> 15%
//		30�� �̻� -> 20%
//		�Ǹűݾ��� ����غ��ϴ�.
//		��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��

		Scanner sc = new Scanner(System.in);

		int num1;
		double num2;

		System.out.print("������ �Է� ");
		num1 = sc.nextInt();
		num2 = num1 * 15800;

//		if (num1 > 30) {
//			num2 *= 0.8;
//		} else if (num1 > 20) {
//			num2 *= 0.85;
//		} else if (num1 > 10) {
//			num2 *= 0.9;
//		}

		num2 *= num1 > 30 ? 0.8 : (num1 > 20 ? 0.85 : (num1 > 10 ? 0.9 : 1));

		System.out.printf("���Լ��� : %d��, �Ǹ��ѱݾ� : %.0f��", num1, num2);

		sc.close();

	}

}
