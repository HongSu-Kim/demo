package com.day2;

public class Test2 {

	public static void main(String[] args) {

		// �ڷ��� : int(����), sting(���ڿ�), double(�Ǽ�) ��
		// int : ����(�� -21�� ~ 21��)
		// num1 : ������(ù���ڴ� �ҹ���)
		// = : ���Կ�����(�����ʰ��� ����(������)�� �־��ش�.)
		int num1 = 20; // ���� ����, �ʱ�ȭ
		int num2; // ���� ����
		num2 = 10; // ���� �ʰ�ȭ

		int num3, num4;

		System.out.println(num1);
		System.out.println(num2);
		// System.out.println(num3); //�����Ͽ���(�ʰ�ȭ�� ������������ ����� �� ����.)

		num3 = num1 + num2; // 20+10 //num3�� �����Ѱ��� ����
		System.out.println(num3);

		num4 = num1 - num2; // 20-10
		System.out.println(num4);

		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);

		num1 = 200;
		num2 = 100;
		num3 = num1 + num2;
		// num4 = num1 - num2;
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

		// format
		// printf : %d���� ���� ���� �ҷ��ü��ִ�. %d(int), %f(double), %s(string)��
		// %d int���� ��
		// %n : �ٹٲ�(\n�� ���� ����)
		num4 = num1 - num2;
		System.out.printf("%d+%d=%d%n", num1, num2, num3);
		System.out.printf("%d-%d=%d", num1, num2, num4);

	}

}
