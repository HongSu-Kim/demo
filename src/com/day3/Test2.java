package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su = 0;

		System.out.print("�� �Է�? ");
		su = Integer.parseInt(br.readLine());

		String str;

		// ���׿����� : ���� ? true�϶� ���� : falce�϶� ����
		str = su == 0 ? "��" : (su % 2 == 0 ? "¦��" : "Ȧ��");
		System.out.print(su + " : " + str);
		str = su > 0 ? "���" : (su < 0 ? "����" : "��");
		System.out.println(", " + str);

		// A && B : A and B : A, B �Ѵ� true�϶� true
		// A || B : A or B : A, B ���߿� �ϳ��� true �϶� true
		str = su % 4 == 0 && (su % 100 != 0 || su % 400 == 0) ? "����" : " ���"; // �������ڴ� �ڿ�������
		System.out.println(su + " : " + str);

	}

}
