package com.day11;

// StringBuffer : ����ȭ �۾��� ���� ��(�ӵ��� ����)
// StringBuilder : ����ȭ �۾��� ���� ����(�ӵ��� ����)

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

		System.out.println("����ð� : " + (end - start) + "ms");

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

		System.out.println("����ð� : " + (end - start) + "ms");

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

		System.out.println("����ð� : " + (end - start) + "ms");

	}

	public static void main(String[] args) {

		Test3 ob = new Test3();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
	}

}
