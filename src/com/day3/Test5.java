package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name, pan;
		int kor;

		System.out.print("�̸�? ");
		name = sc.next();
		System.out.print("����? ");
		kor = sc.nextInt();

		if (kor >= 90) {
			pan = "��";
		} else if (kor >= 80) {
			pan = " ��";
		} else if (kor >= 70) {
			pan = "��";
		} else if (kor >= 60) {
			pan = "��";
		} else {
			pan = "��";
		}

		System.out.println(name + "�� ���� ������ " + kor + "�� �̰� ȯ�������� " + pan + "�Դϴ�.");

		sc.close(); // ���°� ���������� �Ƚ��൵ ������ ������ �ʴ´�.

	}

}
