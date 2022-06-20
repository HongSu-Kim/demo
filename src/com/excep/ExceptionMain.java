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

			System.out.print("�ΰ��� ��[a,b]? ");
			str = br.readLine();

			// �˻�
			auth.inputFormat(str); // ���� 2������ Ȯ��

			String[] temp = str.split(","); // ���� ������ �Է�

			auth.number(temp[0]); // �������� Ȯ��
			num1 = Double.parseDouble(temp[0]); // �����Է�
			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);

			System.out.print("������? ");
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
