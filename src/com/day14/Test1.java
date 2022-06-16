package com.day14;

import java.util.Vector;

// Collection

// 배열의 단점
// 크기가 정해지면 늘리거나 줄이거나 삽입이 불가능

// List (Interface) - ArrayList (Class), Vector (Class)...
// Map (Interface) - HashMap (Class), HashTable (Class)...

public class Test1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// <E> : Generic
		Vector v = new Vector<>(); // <E> 생략시 기본값은 Object

		v.add("서울"); // String // upcast
		v.add(30); // Integer
		v.add('A'); // Character

		String str = (String) v.get(0); // downcast
		System.out.println(str);

		Integer i = (int) v.get(1);
		System.out.println(i);

		Character c = (char) v.get(2);
		System.out.println(c);

		for (int j = 0; j < v.size(); j++) {

			Object ob = v.get(j);

			if (ob instanceof String) {
				str = (String) ob;
				System.out.println(str);
			} else if (ob instanceof Integer) {
				i = (int) ob;
				System.out.println(i);
			} else if (ob instanceof Character) {
				c = (char) ob;
				System.out.println(c);
			}

		}

	}

}
