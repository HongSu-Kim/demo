package com.day3.q;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

//		4. �⵵�� �Է¹ް�, �������� �ƴ����� ���.
//		��) 2010 �Է½� -> 2010 => ���
//		    2012 �Է½� -> 2012 => ����

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("�� �Է� ");
		num = sc.nextInt();

		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
			System.out.println(num + " => ����");
		} else {
			System.out.println(num + " => ���");
		}

		sc.close();

	}

}
