package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	// IOException : 예외처리
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Syetem.in : 키보드로 입력한 1byte문자를 입력 받음
		// InputStreamReader() : System.in으로 받은 문자를 2byte로 변경
		// BufferedReader : 2byte로 변경돤 문자를 저장

		int r;
		double area, length;

		System.out.print("반지름? : "); // 반지름 입력

		r = Integer.parseInt(br.readLine()); // readLine() : 정보를 문자열로 받아옴 //Integer.parseInt() : string(문자열)을 int(정수)로변환
		// r = Double.parseDouble(br.readLine()); //Double로 변환

		area = r * r * 3.14;
		length = r * 2 * 3.14;

		System.out.println("반지름 : " + r);
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

	}

}
