package com.score5;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws Exception {

		ScoreImpl ob = new ScoreImpl();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {

			do {
				System.out.print("1.입력 2.출력 3.종료 : ");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 3);

			switch (ch) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.exit();
				sc.close();
				System.exit(0);
				
			}
		}
	}

}
