package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// reaplceAll

public class Test2 {

	public static String reaplceAll(String str, String oldStr, String newStr) { // oldStr�� newStr�� ����

		if (str == null) {
			return null;
		}

		Pattern p = Pattern.compile(oldStr);

		Matcher m = p.matcher(str); // str���� oldStr�� ã��

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, newStr); // str���� ã�� oldStr�� newStr�� �����ؼ� ����
		}

		m.appendTail(sb); // ������ oldStr�� ���� �ٿ���

		return sb.toString();

	}

	public static void main(String[] args) {

		String str = "�츮���� ���ѹα� ���ѵ��� ������ �Ǿ�.....";

		String s = Test2.reaplceAll(str, "����", "����");

		System.out.println(s);

	}

}
