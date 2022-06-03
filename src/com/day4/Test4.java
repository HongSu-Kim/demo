package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// 수를 입력받아 1에서부터 수까지의 합계

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su, sum;
		char ch;

		while (true) { // 무한루프

			do {
				System.out.print("수를 입력 : ");
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {

				sum += i;

			}
			System.out.printf("1~ %d까지의 합 : %d\n", su, sum);

			do {
				System.out.print("계속? [Y/N] : "); // y\n\r 입력시 \n\r이 남음
				ch = (char) System.in.read();
				System.in.skip(2); // 남은 \n\r을 지워줌
			} while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');

			if (ch == 'N' || ch == 'n') { // ch != 'Y' && ch != 'y'

				System.out.println("프로그램 종료!!");
				break; // 반복문을 빠져나감 // while, do ~ while, for, switch에 사용

			}

		}

	}

}
