package com.day6;

public class Test4 {

	public static void main(String[] args) {

		// Bubble Sort

		int[] num = { 28, 20, 15, 10, 8 };
		int i, j, temp;

		System.out.print("Source Data : ");
		for (int su : num) {
			System.out.printf("%4d", su);
		}
		System.out.println();

		// Select Sort
		// 01 02 03 04 12 13 14 23 24 34
		// Bubble Sort
		// 01 12 23 34 01 12 23 01 12 01
		for (i = 1; i < num.length; i++) {
			for (j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.print("Sorted Data : ");
		for (int su : num) {
			System.out.printf("%4d", su);
		}
		System.out.println();

	}

}
