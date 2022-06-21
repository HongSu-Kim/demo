package com.day16;

import java.util.Scanner;

// 5 ~ 10자 이내의 문자열을 입력 받아서 출력하는 프로그램
// 조건
// 1. 5 ~ 10자 이내의 문자열
// 2. 영문자만 입력

class MyAuthen {

	public void inputFormat(String str) throws Exception {

		// 1. 5 ~ 10자 이내의 문자열
		// 문자열의 길이는 5 ~ 10자 입니다.
		if (str.length() > 10 || str.length() < 5) {
			throw new Exception("문자열의 길이는 5 ~ 10자 입니다.: " + str);
		}

		// 2. 영문자만 입력
		// 영문자만 가능합니다.
		int eng = 0, num = 0;
		for (int i = 0; i < str.length(); i++) {

//			if ((str.charAt(i) < 'a' || str.charAt(i) > 'z') && (str.charAt(i) < 'A' || str.charAt(i) > 'Z')) {
//				throw new Exception("영문자만 가능합니다.: " + str);
//			}

			// 영문자 숫자혼용
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
				eng++;
			else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				num++;

		}

		if (eng < 1 || num < 1) {
			throw new Exception("영문자 숫자를 혼용 해야합니다.: " + str);
		}

	}

}

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthen auth = new MyAuthen();

		try {

			System.out.print("문자열? ");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		sc.close();

	}

}
