package com.day3.q;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

//		2.두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
//		예) 20, 30 입력시 -> 큰 숫자 30, 작은 숫자 20

		Scanner sc = new Scanner(System.in);

		int num1, num2, temp;

		System.out.print("수 2개 입력 ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.printf("큰 숫자 %d, 작은 숫자 %d", num1, num2);

		sc.close();

	}

}
