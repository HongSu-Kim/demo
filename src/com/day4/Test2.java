package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// 수를 입력받아 1에서부터 수까지의 합계

		Scanner sc = new Scanner(System.in);
		int su, sum;
		char ch;

		while (true) { // 무한루프

			do {
				System.out.print("수를 입력 : ");
				su = sc.nextInt();
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {

				sum += i;

			}
			System.out.printf("1~ %d까지의 합 : %d\n", su, sum);
			System.out.print("계속? [Y/N] : ");
			ch = (char) System.in.read();

			if (ch == 'N' || ch == 'n') { // ch != 'Y' && ch != 'y'

				System.out.println("프로그램 종료!!");
				break; // 반복문을 빠져나감 // while, do ~ while, for, switch에 사용

			}

		}

		sc.close();

	}

}
