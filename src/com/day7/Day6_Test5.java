package com.day7;

import java.util.Scanner;

class D6T5 {

	String jumin;
	int tot;

	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]? : ");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("�Է� ����!!");
		}

	}

	public int tot() {

		tot = 0;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		for (int i = 0; i < 12; i++) {

			if (i >= 6) { // ���ڸ�
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2)); // - �ǳʶٱ�
			} else { // ���ڸ�
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));
			}

		}

		return tot;

	}

	public int su(int tot) {

		int su = 11 - tot % 11;
		su = su % 10;

		return su;

	}

	public void print(int su) {

		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("���ѹα� �����Դϴ�.");
		} else {
			System.out.println("�� ������?");
		}

	}

}

public class Day6_Test5 {

	public static void main(String[] args) {

		D6T5 ob = new D6T5();
		ob.input();
		int tot = ob.tot();
		int su = ob.su(tot);
		ob.print(su);

	}

}
