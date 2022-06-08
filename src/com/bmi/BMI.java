package com.bmi;

import java.util.Scanner;

public class BMI {

	int inwon;
	Scanner sc = new Scanner(System.in);
	Record[] rec;

	public void set() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("이름? ");
			rec[i].name = sc.next();
			System.out.print("몸무게? ");
			rec[i].weight = sc.nextDouble();
			System.out.print("키? ");
			rec[i].height = sc.nextDouble();

		}

	}

	private void bmi() {

		for (int i = 0; i < rec.length; i++) {

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

	}

	public void print() {

		bmi();

		for (int i = 0; i < inwon; i++) {
			System.out.printf("이름 : %6s\n", rec[i].name);
			System.out.printf("몸무게 : %.2fkg, 키 : %.2fcm\n", rec[i].weight, rec[i].height);
			System.out.printf("BMI(신체질량지수)는 %.2f이고, %s입니다.\n", rec[i].bmi, rec[i].result);
			System.out.println();
		}

	}

}
