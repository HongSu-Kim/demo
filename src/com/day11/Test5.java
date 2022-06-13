package com.day11;

public class Test5 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String ss[] = s1.split(",");

		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();

		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2 == s3); // false
		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equalsIgnoreCase(s3)); // true // equalsIgnoreCase : ��ҹ��� �������ʰ� ��

		String s4 = "abc.def.hij";
		// index . . 01234567890

		System.out.println(s4.indexOf(".")); // 3 // indexOf : ó������ .�� index
		System.out.println(s4.lastIndexOf(".")); // 7 // lastIndexOf : �ڿ������� ���� ó������ .�� index
		System.out.println(s4.indexOf("def")); // 4
		System.out.println(s4.indexOf("x")); // -1 : false�϶�(��ã���� ��)

		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");
		System.out.println(s6);

		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // trim() : �յ��� ����(\\s)�� ����
		System.out.println(s7.replaceAll(" ", "")); // ����(\\s)�� null�� ����
		System.out.println(s7.replaceAll("\\s", "")); // ����ȭ ǥ����
		
//		String str = "abcdefg";
//		char ch = str.charAt(2);
		char ch = "abcdefg".charAt(2); // String���� 2��index�� ������
		System.out.println(ch); // c

		System.out.println("abcdefg".startsWith("abc")); // true // String�� "abc"�� ����?
		System.out.println("�ڹ����α׷�".startsWith("�ڹ�"));
		
		System.out.println("abcdefg".length()); // 7 // String�� ����
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		// ������ ����(ASCII�ڵ� ���� ����)
		System.out.println(s8.compareTo(s9)); // -1
		System.out.println(s9.compareTo(s8)); // 1 
		
		
		
		
		
	}

}