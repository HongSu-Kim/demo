package com.day7;

import java.util.Scanner;

public class Rect {

	// ��ü(�ν��Ͻ�) ������ ���������� ���� ������ش�.
	int w, h; // ��������, instance ���� : �ʱ�ȭ�� ���������� �ʱⰪ(int�� 0)�� �ڵ����� ����.

	
	// �޼ҵ� ������ ���� ���� ���� �����Ѵ�.
	// �Է�
	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// int w, h; // �������� : input() �������� ��밡��

		System.out.print("����? ");
		w = sc.nextInt();
		System.out.print("����? ");
		h = sc.nextInt();

//		sc.close(); // �޼ҵ�� ��� �ν��ͽ��� �����ϱ� ������ close�� �ϰԵǸ� input�� �ٽ��ϰԵ����� ������ �߻��Ѵ�.
		// return; // void�� ���� return�� ������

	}

	// ���� ���ϱ�
	public int area() {

		int result;

		result = w * h;

		return result;

	}

	// �ѷ� ���ϱ�
	public int length() {

		return (w + h) * 2;

	}

	// ���
	public void print(int a, int l) {

		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);

	}

}
