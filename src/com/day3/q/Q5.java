package com.day3.q;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		5.단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
//		할인율은 다음과 같습니다.
//		10개 이상 -> 10%
//		20개 이상 -> 15%
//		30개 이상 -> 20%
//		판매금액을 계산해봅니다.
//		예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원

		Scanner sc = new Scanner(System.in);

		int num1;
		double num2;

		System.out.print("수량을 입력 ");
		num1 = sc.nextInt();
		num2 = num1 * 15800;

//		if (num1 > 30) {
//			num2 *= 0.8;
//		} else if (num1 > 20) {
//			num2 *= 0.85;
//		} else if (num1 > 10) {
//			num2 *= 0.9;
//		}

		num2 *= num1 > 30 ? 0.8 : (num1 > 20 ? 0.85 : (num1 > 10 ? 0.9 : 1));

		System.out.printf("구입수량 : %d개, 판매총금액 : %.0f원", num1, num2);

		sc.close();

	}

}
