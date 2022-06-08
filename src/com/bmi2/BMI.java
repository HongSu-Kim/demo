package com.bmi2;

import java.io.IOException;
import java.util.Scanner;

public class BMI {

	int inwon, mi;
	Scanner sc = new Scanner(System.in);
	Record[] rec;

	public void set() {

//		do {
//			System.out.print("인원수? ");
//			inwon = sc.nextInt();
//		} while (inwon < 1 || inwon > 10);
//
//		rec = new Record[inwon];
		
		rec = new Record[10];
		
	}

	public int moreInput() throws IOException {

		char ch;

		System.out.print("input or print?[i/p] ");
		ch = (char) System.in.read();
		System.in.skip(2);
		if (ch == 'I' || ch == 'i')
			mi = 0;
		else if (ch == 'P' || ch == 'p')
			mi = 1;
		else
			moreInput();
		return mi;

	}

	public void input() throws IOException {

		do {
			for (int i = 0; i < rec.length; i++) {

				if (rec[i] == null) {

					rec[i] = new Record();

					System.out.print("이름? ");
					rec[i].name = sc.next();
					System.out.print("몸무게? ");
					rec[i].weight = sc.nextDouble();
					System.out.print("키? ");
					rec[i].height = sc.nextDouble();
					rec[i].ID = Record.getSerialNum();

					break;
				}

			}
			moreInput();
		} while (mi == 0);

	}

	private void bmi(int i) {

		if (rec[i].height > 3) { // cm를 m로 변환
			rec[i].height /= 100;
		}

		rec[i].bmi = rec[i].weight / (rec[i].height * rec[i].height);

		if (rec[i].bmi < 18.5)
			rec[i].result = "저체중";
		else if (rec[i].bmi < 23.0)
			rec[i].result = "정상";
		else if (rec[i].bmi < 25)
			rec[i].result = "과체중";
		else
			rec[i].result = "비만";

		rec[i].height *= 100;

	}

	public void print() {

		for (int i = 0; i < rec.length; i++) {

			bmi(i);
			System.out.println();
			System.out.printf("회원번호 : %2d, 이름 : %6s\n", rec[i].ID, rec[i].name);
			System.out.printf("몸무게 : %.2fkg, 키 : %.2fcm\n", rec[i].weight, rec[i].height);
			System.out.printf("BMI(신체질량지수)는 %.2f이고, %s입니다.\n", rec[i].bmi, rec[i].result);

			if (rec[i + 1] == null)
				break;

		}

	}

}
