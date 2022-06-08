package com.bmi;

import java.util.Scanner;

public class BMI {

	int inwon;
	Scanner sc = new Scanner(System.in);
	Record[] rec;

	public void set() {

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("�̸�? ");
			rec[i].name = sc.next();
			System.out.print("������? ");
			rec[i].weight = sc.nextDouble();
			System.out.print("Ű? ");
			rec[i].height = sc.nextDouble();

		}

	}

	private void bmi() {

		for (int i = 0; i < rec.length; i++) {

			if (rec[i].height > 3) { // cm�� m�� ��ȯ
				rec[i].height /= 100;
			}

			rec[i].bmi = rec[i].weight / (rec[i].height * rec[i].height);

			if (rec[i].bmi < 18.5)
				rec[i].result = "��ü��";
			else if (rec[i].bmi < 23.0)
				rec[i].result = "����";
			else if (rec[i].bmi < 25)
				rec[i].result = "��ü��";
			else
				rec[i].result = "��";

			rec[i].height *= 100;
			
		}

	}

	public void print() {

		bmi();

		for (int i = 0; i < inwon; i++) {
			System.out.printf("�̸� : %6s\n", rec[i].name);
			System.out.printf("������ : %.2fkg, Ű : %.2fcm\n", rec[i].weight, rec[i].height);
			System.out.printf("BMI(��ü��������)�� %.2f�̰�, %s�Դϴ�.\n", rec[i].bmi, rec[i].result);
			System.out.println();
		}

	}

}
