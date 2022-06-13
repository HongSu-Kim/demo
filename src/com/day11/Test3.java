package com.day11;

// StringBuffer : 동기화 작업을 지원 함(속도가 느림)
// StringBuilder : 동기화 작업을 지원 안함(속도가 빠름)

public class Test3 {

	public void stringTime() {

		System.out.println("String...");

		// long start = System.currentTimeMillis();
		long start = System.nanoTime();

		@SuppressWarnings("unused")
		String str = "A";
		for (int i = 1; i < 50000; i++) {
			str += "A";
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start) + "ms");

	}

	public void stringBufferTime() {

		System.out.println("stringBufferTime...");

		// long start = System.currentTimeMillis();
		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");
		for (int i = 1; i < 50000; i++) {
			str.append("A");
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start) + "ms");

	}
	
	public void stringBuilderTime() {

		System.out.println("stringBuilderTime...");

		// long start = System.currentTimeMillis();
		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");
		for (int i = 1; i < 50000; i++) {
			str.append("A");
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start) + "ms");

	}

	public static void main(String[] args) {

		Test3 ob = new Test3();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
	}

}
