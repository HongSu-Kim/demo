package com.day18;

import java.io.FileInputStream;

// ���� �����

// FileInputStream

public class Test5 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");

			int data;
			while ((data = fis.read()) != -1) {

//				System.out.println((char) data);
				System.out.write(data); // enter�� ���ö����� ������
				System.out.flush(); // �������� enter�� ��� ���ۿ� �����ִ°� ��������

			}

			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
