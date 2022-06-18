package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

// Map<key, value>
// Hashtable(C) - Vector 동기화
// HashMap(C) - ArratList 빠름

// Key는 중복값을 가질수 없다. Key의 자료형 Set이 중복값을 허용하지않음
// Key가 중복값을 가지게 되면 수정(값을 추가하지 않고 기존 값에 덮어쓴다. )
// Map은 Iterator가 없다. Set의 Iterator를 쓴다.
// put(추가), get(가져오기)

public class Test2 {

	public static final String tel[] = { "111-111", "222-222", "333-333", "111-111", "444-444" }; // key
	public static final String name[] = { "배수지", "유인나", "정인선", "강아랑", "박신혜" }; // value

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}

		System.out.println(h); // 해쉬함수로 변환된 Key를 저장하면 순서가 섞인다.

		String str;
		str = h.get("111-111"); // Key를 주면 Value를 받음
		if (str == null) {
			System.out.println("자료없음!!");
		} else {
			System.out.println(str); // 배수지와 강아랑의 key값이 같아서 배수지 -> 강아랑으로 수정됨
		}

		if (h.containsKey("222-222")) { // Key에서 검색
			System.out.println("222-222 있다");
		} else {
			System.out.println("222-222 없다");
		}

		if (h.containsValue("강아랑")) { // Value에서 검색, Value가 Class인 경우 쓸수 없음
			System.out.println("강아랑 있다");
		} else {
			System.out.println("강아랑 없다.");
		}

		Iterator<String> it = h.keySet().iterator(); // Map에서 사용하는 Iterator // keySet() : Key값을 가져옴
		while (it.hasNext()) {

			String key = it.next(); // Key만 가져옴
			String value = h.get(key); // Key를 통해서 Value를 가져옴
			System.out.println(key + " " + value);

		}

	}

}
