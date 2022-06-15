package com.day13;

// Interface
// 1. �߻�Ŭ������ �������� ���� �ְ� ���ǰ� ����.
// 2. final������ ���� �Ҽ��ִ�.
// 3. �������̽��� �����ҷ��� implements�� ����Ѵ�.
// 4. �ϳ� �̻��� �������̽��� implements�� Ŭ������ �������̽��� ��� �޼ҵ带 ������ �ؾ��Ѵ�.(���ϼ�, ������)
// 5. �������̽��� �ٸ� �������̽��� ��� ������ ������ �̶��� extends�� ����Ѵ�.
// 6. Ŭ�����ʹ� �ٸ��� �������̽��� ���� ����� �����ϴ�.

interface Fruit {

	String Won = "��"; // public static final ����

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
		return "���";
	}

	public String getItems() {
		return "����";
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
//		System.out.println(ob2.getItems()); // getItems()�� FruitImpl�� �޼ҵ�� ��������.

	}

}
