package com.day3;

import java.util.Scanner;

public class Test6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Scanner : �ܶ������� ������ ����� ����
		// �⺻ �ܶ��� ����

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		// System.out.print(" �̸� ���� ���� ����? "); // suzi 50 70 80
		System.out.print(" �̸�,����,����,����? "); // suzi,50,70,80

		// sc = new Scanner(sc.next()) : sc ��ü�� �ٽ� �ҷ���
		// useDelimiter : ������ ����, �⺻�� ����
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + " : " + (kor + eng + mat) + "��");

		sc.close();

	}

}
