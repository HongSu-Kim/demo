package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws AuthenticationException {

		String[] temp = str.split(",");

		if (temp.length != 2) {
			throw new AuthenticationException("���� �Է� ���� ����: " + str);
		}

	}

	@SuppressWarnings("unused")
	public void number(String str) throws AuthenticationException {

		try {

			if (str.indexOf(".") != -1) { // �Ǽ�
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new AuthenticationException("���� ��ȯ �Ұ�:" + str);
		}

	}

	public void operrator(char ch) throws AuthenticationException {

		switch (ch) {
		case '+':
		case '-':
		case '*':
		case '/':
			return;
		default:
			throw new AuthenticationException("������ ����: " + ch);
		}

	}

	public void sub(char ch, double num) throws AuthenticationException {

		if (ch == '/' && num == 0.0) {
			throw new AuthenticationException("������ ����(0���� ����������): " + ch + " " + num);
		}

	}

}
