package com.day4.q;

public class Q1 {

	public static void main(String[] args) {

//		1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10)
//		결과 : 220

		int n = 0, sum1 = 0, sum2 = 0;

//		for (int i = 1; i <= 10; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				sum2 += j;
//
//			}
//
//			sum1 += sum2;
//			sum2 = 0;
//
//		}

		while (n < 10) {
			n++;
			sum2 += n;
			sum1 += sum2;
		}

		System.out.println("결과 : " + sum1);

	}

}
