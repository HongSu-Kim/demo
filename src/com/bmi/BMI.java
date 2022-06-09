package com.bmi;

import java.util.Scanner;

public class BMI {

	int inwon;
	Scanner sc = new Scanner(System.in);
	Profile[] pro;

	public void set() {

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		pro = new Profile[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			pro[i] = new Profile();

			System.out.print("�̸�? ");
			pro[i].name = sc.next();
			System.out.print("������? ");
			pro[i].weight = sc.nextDouble();
			System.out.print("Ű? ");
			pro[i].height = sc.nextDouble();

		}

	}

	private void bmi() {

		for (int i = 0; i < pro.length; i++) {

			if (pro[i].height > 3) { // cm�� m�� ��ȯ
				pro[i].height /= 100;
			}

			pro[i].bmi = pro[i].weight / (pro[i].height * pro[i].height);

			if (pro[i].bmi < 18.5)
				pro[i].result = "��ü��";
			else if (pro[i].bmi < 23.0)
				pro[i].result = "����";
			else if (pro[i].bmi < 25)
				pro[i].result = "��ü��";
			else
				pro[i].result = "��";

			pro[i].height *= 100;
			
		}

	}

	public void print() {

		bmi();

		for (int i = 0; i < inwon; i++) {
			System.out.printf("�̸� : %6s\n", pro[i].name);
			System.out.printf("������ : %.2fkg, Ű : %.2fcm\n", pro[i].weight, pro[i].height);
			System.out.printf("BMI(��ü��������)�� %.2f�̰�, %s�Դϴ�.\n", pro[i].bmi, pro[i].result);
			System.out.println();
		}

	}

}
