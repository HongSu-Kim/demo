package com.day9;

// Call By Value
// stack ������ value�� heap�������� �Ѿ

// Call By Reference
// heap������ �ּҰ� stack�������� �Ѿ

class Test {

	public int x = 10;

	public void sub(int a) {
		x += a;

	}

}

public class Test6 {

	public static void main(String[] args) {

		Test ob = new Test();

		// Call By Value
		int a = 20;

		System.out.println("sub()�޼ҵ� ������ x : " + ob.x); // 10
		ob.sub(a);
		System.out.println("sub()�޼ҵ� ������ x : " + ob.x); // 30

		// Call By Reference
		Test ob1;
		ob1 = ob;

		System.out.println("ob.x : " + ob.x);
		System.out.println("ob1.x : " + ob1.x);

		ob1.x = 100;
		System.out.println("ob.x : " + ob.x);
		System.out.println("ob1.x : " + ob1.x);

	}

}
