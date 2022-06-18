package com.day15;

// Generic

class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}

public class Test4 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Box b1 = new Box(); // 자료형을 정해주지 않으면 Object로 된다.
		b1.set(30); // 30의 자료형 : Integer, upcast : Integer에서 Object로 upcast
		Integer i = (Integer) b1.get(); // downcast
		System.out.println(i);

		Box<Integer> b2 = new Box<>();
		b2.set(20);
		i = b2.get();
		System.out.println(i);

		Box<String> b3 = new Box<>();
		b3.set("서울");
		String s = b3.get();
		System.out.println(s);

	}

}
