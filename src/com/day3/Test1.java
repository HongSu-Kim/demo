package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;

		System.out.print("ù��° ��? ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ��? ");
		num2 = Integer.parseInt(br.readLine());

		// ����ȭǥ���� : �ٸ� ������ �νĵ� ex) \n, \t��
		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2)); // \t : tap
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\t", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2); // ��(/)
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); // ������(%) // printf�ȿ� %�� ������ %%�� ����.

		// �ε�ȣ : >, <, >=, <=, ==
		// ���ڸ� �ε�ȣ�� ���ϸ� true �Ǵ� false���ڰ� �����ȴ�.
		System.out.println("num1 > num2 : " + (num1 > num2)); // >���� +�� ������ ������ ()�� ��� >�� �������ش�.

	}

}
