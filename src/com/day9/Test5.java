package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc {

	private int num1, num2;
	private char oper;

	public boolean input() throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("�ΰ��� ��? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������? ");
		oper = (char) System.in.read();

		// �����ڸ� Ȯ��
		if (oper != '+' && oper != '-' && oper != '*' && oper != '/')
			return false;
		else
			return true;

	}

	public int result() {

		int sum = 0;

		switch (oper) {
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '/':
			sum = num1 / num2;
			break;
		}

		return sum;

	}

	public void print(int r) {
		System.out.printf("%d %c %d = %d\n", num1, oper, num2, r);
	}

}

public class Test5 {

	public static void main(String[] args) throws IOException {

		Calc ob = new Calc();

		// boolean flag = ob.input();

		if (!ob.input()) {
			System.out.println("������ ����!");
			return; // main�� �����ϰ� ����
		}

		int r = ob.result();
		ob.print(r);

	}

}