package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;

		System.out.print("첫번째 수? ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 수? ");
		num2 = Integer.parseInt(br.readLine());

		// 정규화표현식 : 다른 언어에서도 인식됨 ex) \n, \t등
		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2)); // \t : tap
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\t", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2); // 몫(/)
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); // 나머지(%) // printf안에 %를 쓸때는 %%를 쓴다.

		// 부등호 : >, <, >=, <=, ==
		// 숫자를 부등호로 비교하면 true 또는 false문자가 생성된다.
		System.out.println("num1 > num2 : " + (num1 > num2)); // >보다 +가 먼저기 때문에 ()로 묶어서 >를 먼저해준다.

	}

}
