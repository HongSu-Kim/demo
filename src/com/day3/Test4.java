package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// 제어문
		// if, 반복문(for,while,do~while), switch

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String str = null; // null로 초가화 // str = ""도 가능

		System.out.print("수 입력? ");
		num = Integer.parseInt(br.readLine());

		// 단일 if문 : 조건 1, 작업 1
		// if(조건식){작업}

//		if (num % 2 == 0) {
//			str = "짝수";
//		}
//
//		if (num % 2 != 0) {
//			str = "홀수";
//		}

		// if~else
		if (num % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}

		System.out.println(num + " : " + str);

	}

}
