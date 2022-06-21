package com.day16;

import java.util.Scanner;

// 5 ~ 10�� �̳��� ���ڿ��� �Է� �޾Ƽ� ����ϴ� ���α׷�
// ����
// 1. 5 ~ 10�� �̳��� ���ڿ�
// 2. �����ڸ� �Է�

class MyAuthen {

	public void inputFormat(String str) throws Exception {

		// 1. 5 ~ 10�� �̳��� ���ڿ�
		// ���ڿ��� ���̴� 5 ~ 10�� �Դϴ�.
		if (str.length() > 10 || str.length() < 5) {
			throw new Exception("���ڿ��� ���̴� 5 ~ 10�� �Դϴ�.: " + str);
		}

		// 2. �����ڸ� �Է�
		// �����ڸ� �����մϴ�.
		int eng = 0, num = 0;
		for (int i = 0; i < str.length(); i++) {

//			if ((str.charAt(i) < 'a' || str.charAt(i) > 'z') && (str.charAt(i) < 'A' || str.charAt(i) > 'Z')) {
//				throw new Exception("�����ڸ� �����մϴ�.: " + str);
//			}

			// ������ ����ȥ��
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
				eng++;
			else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				num++;

		}

		if (eng < 1 || num < 1) {
			throw new Exception("������ ���ڸ� ȥ�� �ؾ��մϴ�.: " + str);
		}

	}

}

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthen auth = new MyAuthen();

		try {

			System.out.print("���ڿ�? ");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		sc.close();

	}

}
