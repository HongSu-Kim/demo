package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name; // String : Ŭ����(ù���ڰ� �빮��)������ �ڷ���(ù���ڰ� �ҹ���)ó�� ���
		int kor, eng, tot;

		// �Է�
		System.out.print("�̸�? "); // �̸��Է�
		name = br.readLine(); // readLine()�� ���ڿ��� �޾ƿ��� ������ ����ȯ�� ���ص���

		System.out.print("����? "); // �������� �Է�
		kor = Integer.parseInt(br.readLine()); // ���ڿ��� ������ ��ȯ�� ���ְ� ������

		System.out.print("����? "); // �������� �Է�
		eng = Integer.parseInt(br.readLine());

		// ����
		tot = kor + eng;

		// ���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + tot + "��");

	}

}