package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// File
// ���� �� ������ �����Ҽ��ִ� ����� �����ϴ� Ŭ���� (���� ���(����)�� ���������)
// ���� ������ ������ϱ����� �޼ҵ�� ����.

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");

		System.out.println("���ϸ� : " + f.getName());
		System.out.println("���� ������ : " + f.length()); // �ѱ� 2, \s 1, \n 2
		System.out.println("���ϰ�� : " + f.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + f.getCanonicalPath());
		System.out.println("���糯 : " + new Date(f.lastModified()));
		System.out.println("������� : " + f.getParent());
		System.out.println("�б�Ӽ� : " + f.canRead());
		System.out.println("����Ӽ� : " + f.canWrite());

	}

}
