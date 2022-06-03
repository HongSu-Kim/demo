package com.day4.q;

import java.io.IOException;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) throws IOException {

//		5. 두수를 입력받아 적은 수에서 큰수까지의 합
//		1~100 까지의 합 : 5050

		@SuppressWarnings("unused")
		int num1, num2, sum = 0, temp = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("두수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
			num1 = num1 ^ num2;
			num2 = num1 ^ num2;
			num1 = num1 ^ num2;
		}

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}

		System.out.printf("%d ~ %d 까지의 합은 : %d", num1, num2, sum);

		sc.close();

	}

}
