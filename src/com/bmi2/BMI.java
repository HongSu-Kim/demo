package com.bmi2;

import java.io.IOException;
import java.util.Scanner;

public class BMI {

	int inwon, mi;
	Scanner sc = new Scanner(System.in);
	Profile[] pro;

	public void set() {

//		do {
//			System.out.print("�ο���? ");
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

					System.out.print("�̸�? ");
					pro[i].name = sc.next();
					System.out.print("������? ");
					pro[i].weight = sc.nextDouble();
					System.out.print("Ű? ");
					pro[i].height = sc.nextDouble();
					pro[i].ID = Profile.getSerialNum();

					break;
				}

			}
			moreInput();
		} while (mi == 0);

	}

	private void bmi(int i) {

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

	public void print() {

		for (int i = 0; i < pro.length; i++) {

			bmi(i);
			System.out.println();
			System.out.printf("ȸ����ȣ : %2d, �̸� : %6s\n", pro[i].ID, pro[i].name);
			System.out.printf("������ : %.2fkg, Ű : %.2fcm\n", pro[i].weight, pro[i].height);
			System.out.printf("BMI(��ü��������)�� %.2f�̰�, %s�Դϴ�.\n", pro[i].bmi, pro[i].result);

			if (pro[i + 1] == null)
				break;

		}

	}

}
