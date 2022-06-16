package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {

	private static String city[] = { "����", "�λ�", "�뱸", "��õ", "����", "����", "���" };
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // �ڷ��� : String

		System.out.println("�ʱ� �뷮" + v.capacity()); // capacity() : Collection�� �ʱ�뷮 : 10, �ʿ�� �ڵ����� ����(2�辿)

		for (String c : city) // city�迭�� ����ִ� String���� v�� �ʱ�ȭ
			v.add(c); // add() : Collection�� ��� �߰�(���� �ڿ� ��� �߰�)

		String str;

		str = v.firstElement(); // 0 // firstElement() : ù��° ���(index(0))���� ��ȯ
		System.out.println(str);

		str = v.get(1); // getter
		System.out.println(str);

		str = v.lastElement(); // 6 // lastElement() : ������ ��Ұ��� ��ȯ
		System.out.println(str);

		System.out.println(v.size() + "��"); // Collection�� ũ��(����� ����)

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();

		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// �ݺ���
		Iterator<String> it = v.iterator(); // Iterator : Collection�� �ݺ���
		while (it.hasNext()) { // �����Ͱ� �ִ¸�ŭ �ݺ�
			str = it.next(); // next() : getter, i++(������� ��ȯ)
			System.out.print(str + " ");
		}
		System.out.println();

		while (it.hasNext()) { // Iterator���� �������� move�� �����̾(copy�� �ƴ�) ������ ������
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();

		// ����
		v.set(0, "Seoul");
		v.set(1, "Pusan");
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// ����
		v.insertElementAt("���ѹα�", 0); // intsertElementAt(obj, index) : index�� obj�� �߰�, index�ڴ� �ϳ��� �и�
		System.out.println(v.size() + "��");
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// �˻�
		int idx = v.indexOf("�뱸"); // �˻��ؼ� index ���� ������
		if (idx != -1) { // �����Ͱ� ������
			System.out.println("�˻����� " + idx);
		} else {
			System.out.println("�˻����� " + idx);
		}

		// ��������
		Collections.sort(v); 
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// ��������
		Collections.sort(v, Collections.reverseOrder()); // Collections.reverseOrder()������� ����
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// ����
		v.remove("Pusan"); // ��һ���, index�ε� ����
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("���� ���� : " + v.capacity());
		System.out.println("������ ���� : " + v.size() + "��");
		
		// ���� ���� - 2�辿 ����
		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));
		}
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("���� ���� : " + v.capacity());
		System.out.println("������ ���� : " + v.size() + "��");
		
		// ���� ����
		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("���� ���� : " + v.capacity());
		System.out.println("������ ���� : " + v.size() + "��");
		
		// �� ���� ����
		v.trimToSize();
		System.out.println("���� ���� : " + v.capacity());
		System.out.println("������ ���� : " + v.size() + "��");
		
		// ��� ������ ����
		v.clear();
		System.out.println("���� ���� : " + v.capacity());
		System.out.println("������ ���� : " + v.size() + "��");
		
		
		
		
		
		
	}

}
