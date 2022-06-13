package com.day11;

public class Test5 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String ss[] = s1.split(",");

		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();

		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2 == s3); // false
		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equalsIgnoreCase(s3)); // true // equalsIgnoreCase : 대소문자 가리지않고 비교

		String s4 = "abc.def.hij";
		// index . . 01234567890

		System.out.println(s4.indexOf(".")); // 3 // indexOf : 처음나온 .의 index
		System.out.println(s4.lastIndexOf(".")); // 7 // lastIndexOf : 뒤에서부터 세서 처음나온 .의 index
		System.out.println(s4.indexOf("def")); // 4
		System.out.println(s4.indexOf("x")); // -1 : false일때(못찾았을 때)

		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);

		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // trim() : 앞뒤의 공백(\\s)을 지움
		System.out.println(s7.replaceAll(" ", "")); // 공백(\\s)을 null로 변경
		System.out.println(s7.replaceAll("\\s", "")); // 정규화 표현식
		
//		String str = "abcdefg";
//		char ch = str.charAt(2);
		char ch = "abcdefg".charAt(2); // String에서 2번index를 가져옴
		System.out.println(ch); // c

		System.out.println("abcdefg".startsWith("abc")); // true // String이 "abc"로 시작?
		System.out.println("자바프로그램".startsWith("자바"));
		
		System.out.println("abcdefg".length()); // 7 // String의 길이
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		// 사전식 정렬(ASCII코드 값의 차이)
		System.out.println(s8.compareTo(s9)); // -1
		System.out.println(s9.compareTo(s8)); // 1 
		
		
		
		
		
	}

}
