package com.day15;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();

		lists.add("서울");
		lists.add("부산");
		lists.add("대구");

		Iterator<String> it = lists.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}

		// ListIterator
		ListIterator<String> it1 = lists.listIterator();
		while (it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println();

		while (it1.hasPrevious()) { // 역순으로 출력
			System.out.print(it1.previous() + " ");
		}
		System.out.println();

		List<String> lists1 = new ArrayList<>();

		lists1.addAll(lists); // lists의 모든 값을 lists1에 추가
		lists1.add("인천");

		int n = lists1.indexOf("부산");
		lists1.add(n + 1, "광주"); // index(n + 1)에 요소 추가

		for (String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println();

		String str;
		Iterator<String> it2 = lists1.iterator();
		while (it2.hasNext()) {

			str = it2.next();
			if (str.startsWith("부")) { // String이 "부"로 시작하면 true
				System.out.println(str);
			}

		}

	}

}
