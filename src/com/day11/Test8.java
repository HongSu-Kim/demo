package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sum {

	protected int num1, num2, result;
	protected String oper;

	public void write() {

		System.out.printf("%d %s %d = %d", num1, oper, num2, result);

	}

}

class Clac extends Sum {

	String str;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void input() throws IOException {
		System.out.print("����? ");
		str = br.readLine().replace("\\s", "");

		for (String op : new String[] { "+", "-", "*", "/" }) {

			int pos = str.indexOf(op); // op�� index���� ã��, +���� �����ؼ� ������ -1

			if (pos > -1) { // +���� �����ؼ� �ƴϸ� ����
				num1 = Integer.parseInt(str.substring(0, pos)); // index[0]���� �ؼ� op�������� String���� ����(ù��° ��)
				num2 = Integer.parseInt(str.substring(pos + 1)); // index[pos +1](op��)���� �ؼ� �������� String���� ����(�ι�° ��)
				oper = Character.toString(str.charAt(pos));
			}

		}

	}

	public void cal() {

		switch (oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			break;
		}

	}

}

public class Test8 {

	public static void main(String[] args) throws IOException {

		Clac cl = new Clac();
		cl.input();
		cl.cal();
		cl.write();

	}

}
