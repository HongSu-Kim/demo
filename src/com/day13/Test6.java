package com.day13;

// 3. ����Ŭ����(��ø)(Static)

class Outer3 {

	static int a = 10;
	int b = 20;

	public static class Inner3 {

		int c = 30;

		public void write() {

			System.out.println(a);
			// System.out.println(b); // Inner3�� static�̱⶧���� Outer3�� �����Ǳ������� �޸𸮿� �ö󰡼� �����
			// �����ϴ�.
			System.out.println(c);

			Outer3 ob = new Outer3(); // Inner3 ���ο��� Outer3�� ���������ϴ�.
			System.out.println(ob.b);

		}

	}

}

public class Test6 {

	public static void main(String[] args) {

//		Outer3 out = new Outer3(); // Inner3�� static�̱⶧���� Outer3�� ���������ʾƵ� Inner3�� ���� �����ϴ�.

		Outer3.Inner3 inner = new Outer3.Inner3();
		inner.write();

	}

}
