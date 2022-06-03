package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su = 0;

		System.out.print("수 입력? ");
		su = Integer.parseInt(br.readLine());

		String str;

		// 삼항연산자 : 조건 ? true일때 실행 : falce일때 실행
		str = su == 0 ? "영" : (su % 2 == 0 ? "짝수" : "홀수");
		System.out.print(su + " : " + str);
		str = su > 0 ? "양수" : (su < 0 ? "음수" : "영");
		System.out.println(", " + str);

		// A && B : A and B : A, B 둘다 true일때 true
		// A || B : A or B : A, B 둥중에 하나라도 true 일때 true
		str = su % 4 == 0 && (su % 100 != 0 || su % 400 == 0) ? "윤년" : " 평년"; // 논리연산자는 뒤에서부터
		System.out.println(su + " : " + str);

	}

}
