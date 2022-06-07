package com.day7;

import java.util.Scanner;

class D5T4 {

	int num[] = new int[5];
	int i, j;

	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("5개의 정수 입력 : ");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

	}

	public void printSourceData() {

		System.out.print("Source Data : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

	}

	public void selectionSort() {

		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

	}

	public void printSortedData() {

		System.out.print("Sorted Data : ");
		for (int su : num) {
			System.out.printf("%4d", su);
		}
	}

}

public class Day5_Test4 {

	public static void main(String[] args) {

		D5T4 o = new D5T4();
		o.input();
		o.printSourceData();
		o.selectionSort();
		o.printSortedData();

	}

}
