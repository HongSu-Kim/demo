package com.day3.q;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

//		3. 네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
//		예) 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, temp;

		System.out.print("수 4개 입력 ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if (num1 < num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		} // num1 : 제일 큰 수

		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num2 > num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		} // num2 : 제일 작은 수

		System.out.printf("제일 큰 숫자 %d, 제일 작은 숫자 %d", num1, num2);

		sc.close();

	}

}
