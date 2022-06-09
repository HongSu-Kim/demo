package com.bmi3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BMI {

	int inwon, mi;
	Scanner sc = new Scanner(System.in);
	ArrayList<Profile> pro = new ArrayList<Profile>();

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

			pro.add(new Profile());

			int i = pro.size() - 1;

			System.out.print("이름? ");
			pro.get(i).name = sc.next();
			System.out.print("몸무게? ");
			pro.get(i).weight = sc.nextDouble();
			System.out.print("키? ");
			pro.get(i).height = sc.nextDouble();
			pro.get(i).ID = Profile.getSerialNum();

			moreInput();
		} while (mi == 0);

	}

	private void bmi(int i) {

		if (pro.get(i).height > 3) { // cm를 m로 변환
			pro.get(i).height /= 100;
		}

		pro.get(i).bmi = pro.get(i).weight / (pro.get(i).height * pro.get(i).height);

		if (pro.get(i).bmi < 18.5)
			pro.get(i).result = "저체중";
		else if (pro.get(i).bmi < 23.0)
			pro.get(i).result = "정상";
		else if (pro.get(i).bmi < 25)
			pro.get(i).result = "과체중";
		else
			pro.get(i).result = "비만";

		pro.get(i).height *= 100;

	}

	public void print() {

		for (int i = 0; i < pro.size(); i++) {

			bmi(i);
			System.out.println();
			System.out.printf("회원번호 : %2d, 이름 : %6s\n", pro.get(i).ID, pro.get(i).name);
			System.out.printf("몸무게 : %.2fkg, 키 : %.2fcm\n", pro.get(i).weight, pro.get(i).height);
			System.out.printf("BMI(신체질량지수)는 %.2f이고, %s입니다.\n", pro.get(i).bmi, pro.get(i).result);

		}

	}

}
