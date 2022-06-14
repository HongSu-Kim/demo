package com.day11;

// String : �ڷ����� �ƴϰ� class�̴�.

// ������ �����ʹ� ũ��(���ÿ����� �ƴ� �������� �����Ѵ�) ���󵵴� ���⶧����
// String�� �Һ��� ��Ģ�� �������ִ�.(�ѹ� ��������� ���� ���������ʴ´�, ���� �����ϸ� Ŭ������ ���� �����.)

public class Test2 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul"); // new�� ����ϰԵǸ� class�� ���� �����ϰԵȴ�. (���������� �޶�����.)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // true
		System.out.println("ob1 == ob3 : " + (ob1 == ob3)); // false // ob1�� ob3�� ������������ ���Ѵ�(Call By Reference)
		System.out.println("ob1.equals(ob3) : " + ob1.equals(ob3)); // true // String.equals(�������̵�) : Call By Value

		ob2 = "Korea"; // Seoul�� Korea�� �����ϴ°��� �ƴ϶� ���ο� Ŭ������ ���� Korea�� �־��ش�.
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // �ʿ������ ���� ������ �÷��Ͱ� �����ش�.

		ob2 = "Japan";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // false

		ob2 = "China";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // false

		ob2 = "Seoul";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // true

		System.out.println(ob2);
		System.out.println(ob2.toString()); // Object�� toString�� �������̵���

	}

}
