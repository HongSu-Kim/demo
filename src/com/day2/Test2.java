package com.day2;

public class Test2 {

	public static void main(String[] args) {

		// 자료형 : int(정수), sting(문자열), double(실수) 등
		// int : 정수(약 -21억 ~ 21억)
		// num1 : 변수명(첫글자는 소문자)
		// = : 대입연산자(오른쪽값을 왼쪽(변수명)에 넣어준다.)
		int num1 = 20; // 변수 선언, 초기화
		int num2; // 변수 선언
		num2 = 10; // 변수 초가화

		int num3, num4;

		System.out.println(num1);
		System.out.println(num2);
		// System.out.println(num3); //컴파일오류(초가화를 해주지않으면 출력할 수 없다.)

		num3 = num1 + num2; // 20+10 //num3을 선언한곳에 저장
		System.out.println(num3);

		num4 = num1 - num2; // 20-10
		System.out.println(num4);

		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);

		num1 = 200;
		num2 = 100;
		num3 = num1 + num2;
		// num4 = num1 - num2;
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

		// format
		// printf : %d등을 통해 값을 불러올수있다. %d(int), %f(double), %s(string)등
		// %d int값이 들어감
		// %n : 줄바꿈(\n과 같은 역할)
		num4 = num1 - num2;
		System.out.printf("%d+%d=%d%n", num1, num2, num3);
		System.out.printf("%d-%d=%d", num1, num2, num4);

	}

}
