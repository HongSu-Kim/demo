package com.day3.q;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

//		6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
//		-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
//		-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
//		-����� 60�� �̸��̸� ���հ�
//
//		�̸� ? ȫ�浿
//		������ ���� ? 60 70 80
//		�̸� : ȫ�浿
//		���� : 210, ��� : 70, ���� :�հ�

		Scanner sc = new Scanner(System.in);

		String name, str;
		int num1, num2, num3;
		double sum;

		System.out.print("�̸�? ");
		name = sc.next();
		System.out.print("������ ����? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		sum = num1 + num2 + num3;

//		if (sum / 3 >= 60) {
//			if (num1 >= 40 && num2 >= 40 && num3 >= 40) {
//				str = "�հ�";
//			} else {
//				str = "����";
//			}
//		} else {
//			str = "���հ�";
//		}

		str = sum / 3 < 60 ? "���հ�" : (num1 >= 40 && num2 >= 40 && num3 >= 40 ? "�հ�" : "����");
		
		System.out.printf("�̸� : %s\n���� : %.0f, ��� : %.2f, ���� : %s", name, sum, sum / 3, str);

		sc.close();

	}

}
