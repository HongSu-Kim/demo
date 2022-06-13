package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("����? ");
		String str = br.readLine();

		str = str.replaceAll("\\s", ""); // \\s�� ������

//		String[] op = {"+", "-", "*", "/"};
//		for (String o : op) {
		for (String op : new String[] { "+", "-", "*", "/" }) {

			int pos = str.indexOf(op); // op�� index���� ã��, +���� �����ؼ� ������ -1

			if (pos > -1) { // +���� �����ؼ� �ƴϸ� ����
				int num1 = Integer.parseInt(str.substring(0, pos)); // index[0]���� �ؼ� op�������� String���� ����(ù��° ��)
				int num2 = Integer.parseInt(str.substring(pos + 1)); // index[pos +1](op��)���� �ؼ� �������� String���� ����(�ι�° ��)
				
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
