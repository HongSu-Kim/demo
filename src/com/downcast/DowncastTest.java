package com.downcast;

public class DowncastTest {

	public static void main(String[] args) {

		System.out.println("class : ob1");
		Super ob1 = new Super();
		System.out.println("class name : " + ob1.getClass().getSimpleName()); // class name
		ob1.printOverride();
		ob1.printSuper();
		ob1.zx();
		System.out.println("ob1.x : " + ob1.x);
		if (ob1 instanceof Super)
			System.out.println("class type : Super"); // class type
		if (ob1 instanceof Sup)
			System.out.println("class type : Sup");

		System.out.println();

		// extends
		System.out.println("extends : ob2");
		Sup ob2 = new Sup();
		System.out.println("class name : " + ob2.getClass().getSimpleName());
		ob2.printOverride();
		ob2.printSuper();
		ob2.zx();
		System.out.println("ob2.x : " + ob2.x);
		ob2.printSup();
		ob2.xc();
		ob2.zxc();
		if (ob2 instanceof Super)
			System.out.println("class type : Super");
		if (ob2 instanceof Sup)
			System.out.println("class type : Sup");

		System.out.println();

		// upcast
		System.out.println("upcast : ob3");
		Super ob3 = new Sup(); // upcast
		System.out.println("class name : " + ob3.getClass().getSimpleName()); // !!!
		ob3.printOverride();
		ob3.printSuper();
		ob3.zx();
		System.out.println("ob3.x : " + ob3.x);
//		ob3.printQwe();
//		ob3.xc();
//		ob3.zxc();
		if (ob3 instanceof Super)
			System.out.println("class type : Super");
		if (ob3 instanceof Sup)
			System.out.println("class type : Sup");

		System.out.println();

		// downcast
		// 자신의 고유한 특성을 잃은 서브클래스의 객체를 다시 복구시켜주는 것을 말하며,???
		// 업캐스팅된 것을 다시 원상태로 돌리는 것을 말한다.???
		System.out.println("downcast : ob4");
//		Super ob4 = new Super();
//		ob4 = (Sup) ob4; // ClassCastException
		Super ob4 = new Sup(); // upcast
		ob4 = (Sup) ob4; // downcast
		System.out.println("class name : " + ob4.getClass().getSimpleName());
		ob4.printOverride();
		ob4.printSuper();
		ob4.zx();
		System.out.println("ob4.x : " + ob4.x);
//		ob4.printQwe();
//		ob4.xc();
//		ob4.zxc();
		if (ob4 instanceof Super)
			System.out.println("class type : Super");
		if (ob4 instanceof Sup)
			System.out.println("class type : Sup");

		System.out.println();

		double n1 = 2.5;
		int n2;
		double n3;
		System.out.println(n1);
		n2 = (int) n1;
		System.out.println(n2);
		n3 = (double) n2;
		System.out.println(n3);

	}

}
