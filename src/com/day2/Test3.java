package com.day2;

public class Test3 {

	public static void main(String[] args) {

		// float : �Ǽ�
		int r = 10;
		float area, length;

		area = 10; // �ڷ����� float�̱⶧���� 10.0���� ����
		System.out.println(area);

		// float�� ���������� �� ũ�� ������ int�� �Ǽ����� ������ ����
		// (int) : int������ ����ȯ(.������ ���� ����)
		// r = (int)20.5; //r�� 20�� ����
		// System.out.println(r);

		// �Ǽ��� double���� �⺻���� �Ѵ�
		// �Ǽ��� float���� ����ϱ� ���ؼ��� �Ǽ� �ڿ� f(�ĺ���)�� ���δ�.
		area = r * r * 3.14f;
		length = r * 2 * 3.14f;

		System.out.printf("������ : %d, ���� : %f\n", r, area);
		System.out.printf("������ : %d, ���� : %.2f\n", r, area); // %.2f : �Ҽ��� ��¶�ڸ����� ǥ��
		System.out.println("������ : " + r + ", �ѷ� : " + length); // float�� �ٻ��̱� ������ ���� ��Ȯ�����ʴ�.

	}

}
