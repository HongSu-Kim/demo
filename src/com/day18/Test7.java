package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// ���Ϻ���
		// ��������? c:\\doc\\test.txt
		// �������? c:\\doc\\out.txt
		// ����Ϸ�

		Scanner sc = new Scanner(System.in);

		FileInputStream fis;
		FileOutputStream fos;

		int data;

		try {

			System.out.println("���Ϻ���");
			System.out.print("��������? ");
			fis = new FileInputStream(sc.next());
			System.out.print("�������? ");
			fos = new FileOutputStream(sc.next());

			sc.close();

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("����Ϸ�");

		} catch (Exception e) {
		}

	}

}
