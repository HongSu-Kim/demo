package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		// Unicode : ASCII + ���(�ѱ�)
		char ch, result;
		// ch = 'a'; // 97(ASCII) // �������� �ѱ��ڸ� ''�� ����
		// System.out.println(ch); //a
		// System.out.println(Integer.toString(ch)); //97

		System.out.print("�Ѱ��� ����? "); // a(97), A (65)
		ch = (char) System.in.read(); // System.in.read() : ���ڸ� �޾Ƽ� int�� �����ؼ� ����

		// char�� �����ϰԵǸ� int�� �ٲ�
		result = ch >= 65 && ch <= 90 ? (char) (ch + 32) : // �빮�ڸ� �ҹ��ڷ� ���� // ch >= 65 && ch <= 90 : A ~ Z�� true
				(ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch); // �ҹ��ڸ� �빮�ڷ� ���� // 97��� 'a'�� �Է��ص���

		System.out.println(ch + " : " + result);

	}

}
