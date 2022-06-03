package com.day3.q;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

//		6. 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
//		-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
//		-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
//		-평균이 60점 미만이면 불합격
//
//		이름 ? 홍길동
//		세과목 점수 ? 60 70 80
//		이름 : 홍길동
//		총점 : 210, 평균 : 70, 판정 :합격

		Scanner sc = new Scanner(System.in);

		String name, str;
		int num1, num2, num3;
		double sum;

		System.out.print("이름? ");
		name = sc.next();
		System.out.print("세과목 점수? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		sum = num1 + num2 + num3;

//		if (sum / 3 >= 60) {
//			if (num1 >= 40 && num2 >= 40 && num3 >= 40) {
//				str = "합격";
//			} else {
//				str = "과락";
//			}
//		} else {
//			str = "불합격";
//		}

		str = sum / 3 < 60 ? "불합격" : (num1 >= 40 && num2 >= 40 && num3 >= 40 ? "합격" : "과락");
		
		System.out.printf("이름 : %s\n총점 : %.0f, 평균 : %.2f, 판정 : %s", name, sum, sum / 3, str);

		sc.close();

	}

}
