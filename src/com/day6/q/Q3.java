package com.day6.q;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		int n[] = new int[2];
		String s[] = new String[2];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("1.����, 2.����, 3.�� ? ");
		n[0] = rd.nextInt(3) + 1;
		n[1] = sc.nextInt();
		
		for (int i = 0; i < 2; i++) {
			switch (n[i]) {
			case 1:
				s[i] = "����";
				break;
			case 2:
				s[i] = "����";
				break;
			case 3:
				s[i] = "��";
				break;
			default:
				break;
			}
		}

		System.out.printf("��ǻ�� : %s, ��� : %s\n", s[0], s[1]);
		if (s[1] == null) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else if (n[0] == n[1]) {
			System.out.println("�����ϴ�.");
		} else if ((n[0] == 1 && n[1] == 3) || (n[0] == 2 && n[1] == 1) || (n[0] == 3 && n[1] == 2)) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else {
			System.out.println("����� �̰���ϴ�.");
		}

		sc.close();

	}

}
