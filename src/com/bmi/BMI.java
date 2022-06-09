package com.bmi;

import java.util.Scanner;

public class BMI {

	int inwon;
	Scanner sc = new Scanner(System.in);
	Profile[] pro;

	public void set() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		pro = new Profile[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			pro[i] = new Profile();

			System.out.print("이름? ");
			pro[i].name = sc.next();
			System.out.print("몸무게? ");
			pro[i].weight = sc.nextDouble();
			System.out.print("키? ");
			pro[i].height = sc.nextDouble();

		}

	}

	private void bmi() {

		for (int i = 0; i < pro.length; i++) {

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

	}

	public void print() {

		bmi();

		for (int i = 0; i < inwon; i++) {
			System.out.printf("이름 : %6s\n", pro[i].name);
			System.out.printf("몸무게 : %.2fkg, 키 : %.2fcm\n", pro[i].weight, pro[i].height);
			System.out.printf("BMI(신체질량지수)는 %.2f이고, %s입니다.\n", pro[i].bmi, pro[i].result);
			System.out.println();
		}

	}

}
