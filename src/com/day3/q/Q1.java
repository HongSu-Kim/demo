package com.day3.q;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1.������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
//		��) 3 �Է½� -> 3 => Ȧ��
//		��) 4 �Է½� -> 4 => ¦��

		Scanner sc = new Scanner(System.in);

		int num;
		String str;

		System.out.print("�� �Է� ");
		num = sc.nextInt();

//		if (num % 2 == 0) {
//			str = "¦��";
//		} else
//			str = "Ȧ��";

		str = num % 2 == 0 ? "¦��" : "Ȧ��";

		System.out.println(num + " => " + str);

		sc.close();

	}

}
