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
		System.out.print("수식? ");
		str = br.readLine().replace("\\s", "");

		for (String op : new String[] { "+", "-", "*", "/" }) {

			int pos = str.indexOf(op); // op의 index값을 찾음, +부터 시작해서 없으면 -1

			if (pos > -1) { // +부터 시작해서 아니면 생략
				num1 = Integer.parseInt(str.substring(0, pos)); // index[0]부터 해서 op전까지의 String값을 넣음(첫번째 값)
				num2 = Integer.parseInt(str.substring(pos + 1)); // index[pos +1](op후)부터 해서 끝까지의 String값을 넣음(두번째 값)
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
