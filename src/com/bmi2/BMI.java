package com.bmi2;

import java.io.IOException;
import java.util.Scanner;

public class BMI {

	int inwon, mi;
	Scanner sc = new Scanner(System.in);
	Profile[] pro;

	public void set() {

//		do {
//			System.out.print("인원수? ");
//			inwon = sc.nextInt();
//		} while (inwon < 1 || inwon > 10);
//
//		rec = new Record[inwon];
		
		pro = new Profile[10];
		
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
			for (int i = 0; i < pro.length; i++) {

				if (pro[i] == null) {

					pro[i] = new Profile();

					System.out.print("이름? ");
					pro[i].name = sc.next();
					System.out.print("몸무게? ");
					pro[i].weight = sc.nextDouble();
					System.out.print("키? ");
					pro[i].height = sc.nextDouble();
					pro[i].ID = Profile.getSerialNum();

					break;
				}

			}
			moreInput();
		} while (mi == 0);

	}

	private void bmi(int i) {

		if (pro[i].height > 3) { // cm를 m로 변환
			pro[i].height /= 100;
		}

		pro[i].bmi = pro[i].weight / (pro[i].height * pro[i].height);

		if (pro[i].bmi < 18.5)
			pro[i].result = "저체중";
		else if (pro[i].bmi < 23.0)
			pro[i].result = "정상";
		else if (pro[i].bmi < 25)
			pro[i].result = "과체중";
		else
			pro[i].result = "비만";

		pro[i].height *= 100;

	}

	public void print() {

		for (int i = 0; i < pro.length; i++) {

			bmi(i);
			System.out.println();
			System.out.printf("회원번호 : %2d, 이름 : %6s\n", pro[i].ID, pro[i].name);
			System.out.printf("몸무게 : %.2fkg, 키 : %.2fcm\n", pro[i].weight, pro[i].height);
			System.out.printf("BMI(신체질량지수)는 %.2f이고, %s입니다.\n", pro[i].bmi, pro[i].result);

			if (pro[i + 1] == null)
				break;

		}

	}

}
