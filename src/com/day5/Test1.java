package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �迭
		// �ѹ� �����ϸ� �ø��ų� ���ϼ�����.

		int[] num = new int[5]; // int num[] = new int[5]; // num[0] ~ num[4]
		Scanner sc = new Scanner(System.in);

//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		// num[5] = 60; // ArrayIndexOutOfBoundsException : �迭 �������� ����ٴ� ����
		System.out.print(num.length + "���� ����? : "); // .length : �迭 ũ��
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("�迭�� ���� : " + num.length + "��"); // �迭�� .length���� ()�� ����

//		System.out.println("num[0] : " + num[0]);
//		System.out.println("num[1] : " + num[1]);
//		System.out.println("num[2] : " + num[2]);
//		System.out.println("num[3] : " + num[3]);
//		System.out.println("num[4] : " + num[4]);
		for (int i = 0; i < num.length; i++) { // �迭�� for���� ���� ���� ��찡 ����
			System.out.println("num[" + i + "] : " + num[i]);
		}

		num[3] = 400;
		System.out.println("num[3] : " + num[3]);

		int su = num[1];
		System.out.println(su + " : " + num[1]);

		num[4] = num[0] + num[1];
		System.out.println("num[4] : " + num[4]);

		sc.close();

	}

}
