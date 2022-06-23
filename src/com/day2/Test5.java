package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		// 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name; // String : 클래스(첫글자가 대문자)이지만 자료형(첫글자가 소문자)처럼 사용
		int kor, eng, tot;

		// 입력
		System.out.print("이름? "); // 이름입력
		name = br.readLine(); // readLine()이 문자열로 받아오기 때문에 형변환을 안해도됨

		System.out.print("국어? "); // 국어점수 입력
		kor = Integer.parseInt(br.readLine()); // 문자열을 정수로 변환을 해주고 대입함

		System.out.print("영어? "); // 영어점수 입력
		eng = Integer.parseInt(br.readLine());

		// 연산
		tot = kor + eng;

		// 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot + "점");

	}

}