package com.day6.q;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {

//		2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
//		   (3번안에 알아맞추지 못하면 발생된 난수를 출력)

		int n1, n2, i = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		char ch = 0;

		do {
			
			if (i != 0) {
				System.out.println("--------------------------------");
			}
			
			n1 = rd.nextInt(10) + 1;
			i = 0;
			
			while (i < 3) {
				
				i++;
				System.out.printf("정수 입력[%d번째 기회] : ", i);
				n2 = sc.nextInt();
				
				if (n1 == n2) {
					System.out.println("맞았어요!!");
					break;
				} else {
					System.out.println("틀렸어요!!");
				}
				
			}
			
			System.out.printf("정답은 %d입니다.\n", n1);
			
			do {
				
				System.out.print("계속할래?[Y/N] ");
				ch = (char) System.in.read();
				System.in.skip(2);
				
			} while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');
			
		} while (ch == 'Y' || ch == 'y');

		System.out.println("프로그램 종료");

		sc.close();

	}

}
