package com.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		// Set : (value)중복값 허용 안함
		Set<String> s = new HashSet<>();

		s.add("서울");
		s.add("부산");
		s.add("대구");

		System.out.println(s);

		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();

		s.add("서울"); // 중복X
		System.out.println(s);

		// Stack : FILO : 처음 들어간 값이 마지막에 나온다
		Stack<String> st = new Stack<>();

		st.push("서울"); // push() : Stack에서 사용하는 add()
		st.push("부산");
		st.add("광주"); // add()도 사용 가능

		while (!st.empty()) { // empty() : Stack이 비었는지 확인해서 비었으면 true
			System.out.print(st.pop() + " "); // pop() : 최근 요소 삭제
		}
		System.out.println();

		// Queue : FIFO : 먼저 들어간 값이 먼저 나온다
		Queue<String> q = new LinkedList<>();

		q.offer("서울"); // offer() : Queue에서 사용하는 add()
		q.offer("대구");
		q.add("울산"); // add()도 사용 가능

		while (q.peek() != null) { // peek() 최근 요소 조회
			System.out.print(q.poll() + " "); // poll() : (현재 요소중)먼저 추가된 요소 삭제
		}
		System.out.println();

		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");

		List<String> list2 = new LinkedList<>();
		list2.add("서울");
		list2.add("대구");
		list2.add("부산");

		list2.addAll(list1); // list1의 모든 값을 list2에 추가

		System.out.println("list1...");
		for (String ss : list1) {
			System.out.print(ss + " ");
		}
		System.out.println();

		System.out.println("list2...");
		for (String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();

		list2.subList(2, 5).clear(); // 2~4 삭제 // subList() : 요소 선택(범위) // clear() : 삭제
		System.out.println("list2...");
		for (String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();

		// 배열
		String[] str = { "나", "마", "라", "가", "바", "다" };

		for (String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();

		Arrays.sort(str); // sort() : 정렬

		for (String sss : str) {
			System.out.print(sss + " ");
		}
		System.out.println();

	}

}
