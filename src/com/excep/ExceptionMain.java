package com.excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		double num1, num2, result;

		OperationAuthenticator auth = new OperationAuthenticator();

		try {

			System.out.print("두개의 수[a,b]? ");
			str = br.readLine();

			// 검사
			auth.inputFormat(str); // 수가 2개인지 확인

			String[] temp = str.split(","); // 숫자 나눠서 입력

			auth.number(temp[0]); // 숫자인지 확인
			num1 = Double.parseDouble(temp[0]); // 숫자입력
			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);

			System.out.print("연산자? ");
			str = br.readLine();

			auth.operrator(str.charAt(0));
			char ch = str.charAt(0);
			
			auth.sub(ch, num2);
			
			result = 0;
			if (ch == '+')
				result = num1 + num2;
			else if (ch == '-')
				result = num1 - num2;
			else if (ch == '*')
				result = num1 * num2;
			else if (ch == '/')
				result = num1 / num2;

			System.out.printf("%g %s %g = %g\n", num1, ch, num2, result);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
