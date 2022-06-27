package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// reaplceAll

public class Test2 {

	public static String reaplceAll(String str, String oldStr, String newStr) { // oldStr를 newStr로 변경

		if (str == null) {
			return null;
		}

		Pattern p = Pattern.compile(oldStr);

		Matcher m = p.matcher(str); // str에서 oldStr을 찾음

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, newStr); // str에서 찾은 oldStr에 newStr을 수정해서 넣음
		}

		m.appendTail(sb); // 마지막 oldStr의 값을 붙여줌

		return sb.toString();

	}

	public static void main(String[] args) {

		String str = "우리나라 대한민국 대한독립 대한의 건아.....";

		String s = Test2.reaplceAll(str, "대한", "大韓");

		System.out.println(s);

	}

}
