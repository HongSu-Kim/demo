package com.day7;

import java.util.Scanner;

class D6T5 {

	String jumin;
	int tot;

	public void input() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호[xxxxxx-xxxxxxx]? : ");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("입력 오류!!");
		}

	}

	public int tot() {

		tot = 0;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		for (int i = 0; i < 12; i++) {

			if (i >= 6) { // 뒷자리
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2)); // - 건너뛰기
			} else { // 앞자리
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
			System.out.println("대한민국 국민입니다.");
		} else {
			System.out.println("넌 누구냐?");
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
