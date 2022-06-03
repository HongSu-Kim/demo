package com.day4.q;

public class Q3 {

	public static void main(String[] args) {

//		3. 1-2+3-4+5-6+7-8+9-10
//		결과 : -5

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

//			if (i % 2 != 0) {
//				sum += i;
//			} else {
//				sum -= i;
//			}

			sum += i % 2 != 0 ? i : -i;

		}

		System.out.println("결과 : " + sum);

	}

}
