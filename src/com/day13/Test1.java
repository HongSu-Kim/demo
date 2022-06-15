package com.day13;

// Interface
// 1. 추상클래스의 일종으로 선언만 있고 정의가 없다.
// 2. final변수만 정의 할수있다.
// 3. 인터페이스를 구현할려면 implements를 사용한다.
// 4. 하나 이상의 인터페이스를 implements한 클래스는 인터페이스의 모든 메소드를 재정의 해야한다.(통일성, 강제성)
// 5. 인터페이스가 다른 인터페이스를 상속 받을수 있으며 이때는 extends를 사용한다.
// 6. 클래스와는 다르게 인터페이스는 다중 상속이 가능하다.

interface Fruit {

	String Won = "원"; // public static final 생략

	int getPrice(); // public abstract

	public String getName(); // abstract

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	public String getItems() {
		return "과일";
	}

}

public class Test1 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();

		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);

		Fruit ob2 = ob1; // upcast
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItems()); // getItems()는 FruitImpl의 메소드라서 쓸수없다.

	}

}
