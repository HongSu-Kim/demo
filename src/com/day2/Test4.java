package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	// IOException : ����ó��
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Syetem.in : Ű����� �Է��� 1byte���ڸ� �Է� ����
		// InputStreamReader() : System.in���� ���� ���ڸ� 2byte�� ����
		// BufferedReader : 2byte�� ����� ���ڸ� ����

		int r;
		double area, length;

		System.out.print("������? : "); // ������ �Է�

		r = Integer.parseInt(br.readLine()); // readLine() : ������ ���ڿ��� �޾ƿ� //Integer.parseInt() : string(���ڿ�)�� int(����)�κ�ȯ
		// r = Double.parseDouble(br.readLine()); //Double�� ��ȯ

		area = r * r * 3.14;
		length = r * 2 * 3.14;

		System.out.println("������ : " + r);
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + length);

	}

}
