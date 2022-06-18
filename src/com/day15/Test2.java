package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

// Map<key, value>
// Hashtable(C) - Vector ����ȭ
// HashMap(C) - ArratList ����

// Key�� �ߺ����� ������ ����. Key�� �ڷ��� Set�� �ߺ����� �����������
// Key�� �ߺ����� ������ �Ǹ� ����(���� �߰����� �ʰ� ���� ���� �����. )
// Map�� Iterator�� ����. Set�� Iterator�� ����.
// put(�߰�), get(��������)

public class Test2 {

	public static final String tel[] = { "111-111", "222-222", "333-333", "111-111", "444-444" }; // key
	public static final String name[] = { "�����", "���γ�", "���μ�", "���ƶ�", "�ڽ���" }; // value

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}

		System.out.println(h); // �ؽ��Լ��� ��ȯ�� Key�� �����ϸ� ������ ���δ�.

		String str;
		str = h.get("111-111"); // Key�� �ָ� Value�� ����
		if (str == null) {
			System.out.println("�ڷ����!!");
		} else {
			System.out.println(str); // ������� ���ƶ��� key���� ���Ƽ� ����� -> ���ƶ����� ������
		}

		if (h.containsKey("222-222")) { // Key���� �˻�
			System.out.println("222-222 �ִ�");
		} else {
			System.out.println("222-222 ����");
		}

		if (h.containsValue("���ƶ�")) { // Value���� �˻�, Value�� Class�� ��� ���� ����
			System.out.println("���ƶ� �ִ�");
		} else {
			System.out.println("���ƶ� ����.");
		}

		Iterator<String> it = h.keySet().iterator(); // Map���� ����ϴ� Iterator // keySet() : Key���� ������
		while (it.hasNext()) {

			String key = it.next(); // Key�� ������
			String value = h.get(key); // Key�� ���ؼ� Value�� ������
			System.out.println(key + " " + value);

		}

	}

}
