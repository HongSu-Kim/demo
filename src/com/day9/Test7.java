package com.day9;

public class Test7 {

	// 비정형 인수
	// 인수(매개변수)의 갯수가 정해지지 않음
	// 인수를 배열 형태로 저장
	int sum(int... arg) {

		int sum = 0;

//		for (int i = 0; i < arg.length; i++) {
//			sum += arg[i];
//		}

		for (int su : arg) {
			sum += su;
		}

		return sum;

	}

	public static void main(String[] args) {

		Test7 ob = new Test7();

		int result;

		result = ob.sum(2, 4, 6, 8, 10);

		System.out.println(result); // 30

		result = ob.sum(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
		System.out.println(result); // 100

	}

}
