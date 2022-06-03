package com.day2;

public class Test3 {

	public static void main(String[] args) {

		// float : 실수
		int r = 10;
		float area, length;

		area = 10; // 자료형이 float이기때문에 10.0으로 저장
		System.out.println(area);

		// float이 개념적으로 더 크기 떄문에 int에 실수값을 넣을수 없음
		// (int) : int값으로 형변환(.이후의 값을 날림)
		// r = (int)20.5; //r에 20이 저장
		// System.out.println(r);

		// 실수는 double형을 기본으로 한다
		// 실수를 float으로 사용하기 위해서는 실수 뒤에 f(식별자)를 붙인다.
		area = r * r * 3.14f;
		length = r * 2 * 3.14f;

		System.out.printf("반지름 : %d, 넓이 : %f\n", r, area);
		System.out.printf("반지름 : %d, 넓이 : %.2f\n", r, area); // %.2f : 소숫점 둘쨋자리까지 표시
		System.out.println("반지름 : " + r + ", 둘레 : " + length); // float은 근삿값이기 떄문에 값이 정확하지않다.

	}

}
