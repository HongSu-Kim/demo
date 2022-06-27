package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규화 표현식
// 단어 바꾸기, 메일주소 검사, 파일 제어문자 제거

// c[a-z]* : c로 시작하는 영단어(c, ca, caaa), 소문자만
// c[a-z] : c로 시작하는 두글자 영단어(ca, ck)
// c[a-zA-Z0-9] : ca, cA, c4, 소문자, 대문자, 숫자 가능
// c. : c로 시작하는 두글자(ca,cB,c&), 모든 문자(두글자) 가능
// c.* : c로 시작하는 모든 문자
// c.*t : ct, chhhhhht, c77777t, c로 시작해서 t로 끝나는 문자
// [b|c].* 또는 [bc].* 또는 [b-c].* : b, c, bbb, cccc, b나 c로 시작하는 문자
// [^b|c].* 또는 [^bc].* 또는 [^b-c].* : b또는c로 시작되면 안됨
// .*c.* : c가 포함된 모든 문자열
// [\\d]+또는 [0-9]+ : 하나 이상의 숫자 포함

public class Test1 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "c.", "c0", "car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*"); // c로 시작

		for (String s : str) {
			Matcher m = p.matcher(s); // s의 형식이 p에 일치하는지 확인

			if (m.matches()) // 일치하는 s를 출력
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		p = Pattern.compile("c[a-z]+"); // 2글자 이상

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		p = Pattern.compile("c."); // 2글자

		for (String s : str) {

			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		String[] mails = { "aaa@aaa.com", "@aaa.co.kr", "@bbb.com", "aaa@vvv.co.kr", "sss.co.kr", "abc@bbb" };

		// [\\w]+ : 한글자 이상의 영, 숫자
		// @
		// (\\.[\\w]+)+ : 괄호안에 있는 것은 반드시 한번을 출력되야 함
		// \\. : 도트
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";

		for (String s : mails) {
			if (Pattern.matches(pat, s))
				System.out.println(s);
		}

	}
}
