package com.day18;

import java.io.IOException;

// Stream
// ������ ����½� ��� �������� ���¿ʹ� ���þ��� �ܹ��� �帧���� �����͸� �����ϴ� Ŭ����

// in.read, out.print
// in : �⺻ �Է� ��Ʈ��(����Ʈ ��Ʈ��)

public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;

		System.out.print("���ڿ�? ");
		while ((data = System.in.read()) != -1) { // ���� ���� ����������

			char ch = (char) data;
			System.out.print(ch);

		}

	}

}
