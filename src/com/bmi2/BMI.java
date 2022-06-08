package com.bmi2;

import java.io.IOException;
import java.util.Scanner;

public class BMI {

	int inwon, mi;
	Scanner sc = new Scanner(System.in);
	Record[] rec;

	public void set() {

//		do {
//			System.out.print("�ο���? ");
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

					System.out.print("�̸�? ");
					rec[i].name = sc.next();
					System.out.print("������? ");
					rec[i].weight = sc.nextDouble();
					System.out.print("Ű? ");
					rec[i].height = sc.nextDouble();
					rec[i].ID = Record.getSerialNum();

					break;
				}

			}
			moreInput();
		} while (mi == 0);

	}

	private void bmi(int i) {

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

	public void print() {

		for (int i = 0; i < rec.length; i++) {

			bmi(i);
			System.out.println();
			System.out.printf("ȸ����ȣ : %2d, �̸� : %6s\n", rec[i].ID, rec[i].name);
			System.out.printf("������ : %.2fkg, Ű : %.2fcm\n", rec[i].weight, rec[i].height);
			System.out.printf("BMI(��ü��������)�� %.2f�̰�, %s�Դϴ�.\n", rec[i].bmi, rec[i].result);

			if (rec[i + 1] == null)
				break;

		}

	}

}
