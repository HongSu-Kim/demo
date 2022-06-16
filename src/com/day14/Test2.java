package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {

	private static String city[] = { "서울", "부산", "대구", "인천", "광주", "대전", "울산" };
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // 자료형 : String

		System.out.println("초기 용량" + v.capacity()); // capacity() : Collection의 초기용량 : 10, 필요시 자동으로 증가(2배씩)

		for (String c : city) // city배열에 들어있는 String값을 v에 초기화
			v.add(c); // add() : Collection에 요소 추가(가장 뒤에 요소 추가)

		String str;

		str = v.firstElement(); // 0 // firstElement() : 첫번째 요소(index(0))값을 반환
		System.out.println(str);

		str = v.get(1); // getter
		System.out.println(str);

		str = v.lastElement(); // 6 // lastElement() : 마지막 요소값을 반환
		System.out.println(str);

		System.out.println(v.size() + "개"); // Collection의 크기(요소의 갯수)

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();

		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// 반복자
		Iterator<String> it = v.iterator(); // Iterator : Collection의 반복자
		while (it.hasNext()) { // 데이터가 있는만큼 반복
			str = it.next(); // next() : getter, i++(순서대로 반환)
			System.out.print(str + " ");
		}
		System.out.println();

		while (it.hasNext()) { // Iterator에서 꺼낼때는 move의 개념이어서(copy가 아님) 쓰고나면 없어짐
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();

		// 변경
		v.set(0, "Seoul");
		v.set(1, "Pusan");
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// 삽입
		v.insertElementAt("대한민국", 0); // intsertElementAt(obj, index) : index에 obj를 추가, index뒤는 하나씩 밀림
		System.out.println(v.size() + "개");
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();

		// 검색
		int idx = v.indexOf("대구"); // 검색해서 index 값을 가져옴
		if (idx != -1) { // 데이터가 있으면
			System.out.println("검색성공 " + idx);
		} else {
			System.out.println("검색실패 " + idx);
		}

		// 오름차순
		Collections.sort(v); 
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// 내림차순
		Collections.sort(v, Collections.reverseOrder()); // Collections.reverseOrder()방법으로 정렬
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// 삭제
		v.remove("Pusan"); // 요소삭제, index로도 가능
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 갯수 : " + v.capacity());
		System.out.println("데이터 갯수 : " + v.size() + "개");
		
		// 공간 증가 - 2배씩 증가
		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));
		}
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("공간 갯수 : " + v.capacity());
		System.out.println("데이터 갯수 : " + v.size() + "개");
		
		// 범위 삭제
		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}
		for (String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("공간 갯수 : " + v.capacity());
		System.out.println("데이터 갯수 : " + v.size() + "개");
		
		// 빈 공간 삭제
		v.trimToSize();
		System.out.println("공간 갯수 : " + v.capacity());
		System.out.println("데이터 갯수 : " + v.size() + "개");
		
		// 모든 데이터 삭제
		v.clear();
		System.out.println("공간 갯수 : " + v.capacity());
		System.out.println("데이터 갯수 : " + v.size() + "개");
		
		
		
		
		
		
	}

}
