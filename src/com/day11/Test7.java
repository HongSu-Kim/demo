package com.day11;

// Wrapper Ŭ����
// �⺻ �ڷ����� ��ü�� ����Ҽ��ְ� ���ش�. 

// �⺻ �ڷ���
// boolean, byte, char, short, int, float, double

// reference(class) �ڷ��� // �⺻ �ڷ����� �����ϱ����� class
// Boolean, Byte, Character, Short, Integer, Float, Double

// Auto-Boxing : stack -> heap
// Auto-unBoxing : heap -> stack

public class Test7 {

	public static void main(String[] args) {

		int a = 24;

		System.out.println(a + 10); // 34
		System.out.println(Integer.toString(a) + 10); // 2410
		System.out.println(Integer.toString(a, 2)); // 11000 // 2������ ����
		System.out.println(Integer.toString(a, 16)); // 18 // 16������ ����

		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		num1 = n1; // Auto-Boxing
		n2 = num2; // Auto-unBoxing
		System.out.println(n1 + " : " + num1);
		System.out.println(n2 + " : " + num2);

//
//		int a = 10; float b;
//
//		b = a; // b == 10.0 // �Ͻ��� ����ȯ
//		b = (float)a; // ����� ����ȯ
//
//		a = b; // error
//		a = (int)b; // ���� ���� ū ���� �������� ����� ����ȯ�� �ؾ��Ѵ�.
//
//		------------------------------------------------------------------------
//
//		B(�θ�) - A(�ڽ�)
//
//		B = A; // UPCAST
//		B = (B)A; // ����� UPCAST
//		
//		A = B; // error
//		A = (A)B // ����� DOWNCAST
//

	}

}
