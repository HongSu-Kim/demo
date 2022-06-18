package com.day15;

class Box2<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U> void print(U u) {
		System.out.println(u);
		System.out.println("t 클래스 : " + t.getClass().getSimpleName());
		System.out.println("u 클래스 : " + u.getClass().getSimpleName());

	}

}

public class Test5 {

	public static void main(String[] args) {

		Box2<Integer> b = new Box2<>();

		b.set(30);

		b.print("test");
		b.print(50);
		b.print('a');
		b.print(true);

	}

}
