package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		// Unicode : ASCII + 언어(한글)
		char ch, result;
		// ch = 'a'; // 97(ASCII) // 문자형은 한글자만 ''로 저장
		// System.out.println(ch); //a
		// System.out.println(Integer.toString(ch)); //97

		System.out.print("한개의 문자? "); // a(97), A (65)
		ch = (char) System.in.read(); // System.in.read() : 문자를 받아서 int로 변경해서 받음

		// char를 연산하게되면 int로 바뀜
		result = ch >= 65 && ch <= 90 ? (char) (ch + 32) : // 대문자면 소문자로 변경 // ch >= 65 && ch <= 90 : A ~ Z면 true
				(ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch); // 소문자면 대문자로 변경 // 97대신 'a'로 입력해도됨

		System.out.println(ch + " : " + result);

	}

}
