package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		// 밑변(w)과 높이(h)를 입력받아 삼각형의 넓이(a) 구하기
		// 밑변? 23.5
		// 높이? 34.7
		// 넓이 : xxx.xxx
		// 넓이 = 밑변 * 높이 / 2

		// 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double w, h, a;

		// 입력
		System.out.print("밑변? ");
		w = Double.parseDouble(br.readLine());
		System.out.print("높이? ");
		h = Double.parseDouble(br.readLine());

		// 연산
		a = w * h / 2;

		// 출력
		System.out.println("넓이 : " + a);

		/*
		 * int
		 * 
		 * //선언 BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); int w,h; double a;
		 * 
		 * //입력 System.out.print("밑변? "); w = Integer.parseInt(br.readLine());
		 * System.out.print("높이? "); h = Integer.parseInt(br.readLine());
		 * 
		 * //연산 a = w * h / 2.0; //w,h가 정수이기때문에 2(int)로 나누면 정수*정수/정수=정수가 되기때문에
		 * 2.0(double)로 나눠서 정수*정수/실수=실수로 만들어준다.
		 * 
		 * //출력 System.out.println("넓이 : " + a);
		 * 
		 */

		/*
		 * float
		 * 
		 * //선언 BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); float w,h,a;
		 * 
		 * //입력 System.out.print("밑변? "); w = Float.parseFloat(br.readLine());
		 * System.out.print("높이? "); h = Float.parseFloat(br.readLine());
		 * 
		 * //연산 a = w * h / 2;
		 * 
		 * //출력 System.out.println("넓이 : " + a);
		 * 
		 */

	}

}
