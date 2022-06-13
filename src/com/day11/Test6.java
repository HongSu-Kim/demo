package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("수식? ");
		String str = br.readLine();

		str = str.replaceAll("\\s", ""); // \\s를 지워줌

//		String[] op = {"+", "-", "*", "/"};
//		for (String o : op) {
		for (String op : new String[] { "+", "-", "*", "/" }) {

			int pos = str.indexOf(op); // op의 index값을 찾음, +부터 시작해서 없으면 -1

			if (pos > -1) { // +부터 시작해서 아니면 생략
				int num1 = Integer.parseInt(str.substring(0, pos)); // index[0]부터 해서 op전까지의 String값을 넣음(첫번째 값)
				int num2 = Integer.parseInt(str.substring(pos + 1)); // index[pos +1](op후)부터 해서 끝까지의 String값을 넣음(두번째 값)
				
				int result = 0;
				char oper = str.charAt(pos); 
				switch (oper) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				default:
					break;
				}
						
//				System.out.printf("%d %c %d = %d", num1, oper, num2, result);
				String s = String.format("%d %c %d = %d", num1, oper, num2, result);
				System.out.println(s);
						
			}

		}

	}

}
