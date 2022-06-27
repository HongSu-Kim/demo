package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ����ȭ ǥ����
// �ܾ� �ٲٱ�, �����ּ� �˻�, ���� ����� ����

// c[a-z]* : c�� �����ϴ� ���ܾ�(c, ca, caaa), �ҹ��ڸ�
// c[a-z] : c�� �����ϴ� �α��� ���ܾ�(ca, ck)
// c[a-zA-Z0-9] : ca, cA, c4, �ҹ���, �빮��, ���� ����
// c. : c�� �����ϴ� �α���(ca,cB,c&), ��� ����(�α���) ����
// c.* : c�� �����ϴ� ��� ����
// c.*t : ct, chhhhhht, c77777t, c�� �����ؼ� t�� ������ ����
// [b|c].* �Ǵ� [bc].* �Ǵ� [b-c].* : b, c, bbb, cccc, b�� c�� �����ϴ� ����
// [^b|c].* �Ǵ� [^bc].* �Ǵ� [^b-c].* : b�Ǵ�c�� ���۵Ǹ� �ȵ�
// .*c.* : c�� ���Ե� ��� ���ڿ�
// [\\d]+�Ǵ� [0-9]+ : �ϳ� �̻��� ���� ����

public class Test1 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "c.", "c0", "car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*"); // c�� ����

		for (String s : str) {
			Matcher m = p.matcher(s); // s�� ������ p�� ��ġ�ϴ��� Ȯ��

			if (m.matches()) // ��ġ�ϴ� s�� ���
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		p = Pattern.compile("c[a-z]+"); // 2���� �̻�

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		p = Pattern.compile("c."); // 2����

		for (String s : str) {

			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.print(s + " ");
		}

		System.out.println("\n------------------------");

		String[] mails = { "aaa@aaa.com", "@aaa.co.kr", "@bbb.com", "aaa@vvv.co.kr", "sss.co.kr", "abc@bbb" };

		// [\\w]+ : �ѱ��� �̻��� ��, ����
		// @
		// (\\.[\\w]+)+ : ��ȣ�ȿ� �ִ� ���� �ݵ�� �ѹ��� ��µǾ� ��
		// \\. : ��Ʈ
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";

		for (String s : mails) {
			if (Pattern.matches(pat, s))
				System.out.println(s);
		}

	}
}
