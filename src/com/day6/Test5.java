package com.day6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

//		// String
//		String str = "seoul Korea";
//		// index :. . 01234567890
//
//		System.out.println(str.substring(0, 3)); // seo : 0 ~ 3-1
//		System.out.println(str.substring(6, 8)); // ko : 6 ~ 8-1
//		System.out.println(str.substring(6)); // korea : 6 ~

		Scanner sc = new Scanner(System.in);

		// index : 01234567890123
		// jumin : 900110-2053126
		// chk : . 234567 892345

		// tot = (9*2) + (0*3) +....+ (2*5)
		// tot = 11 - tot % 11
		// tot = tot % 10
		// tot == 6 : 정상

		String jumin;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, tot, su;

		System.out.print("주민번호[xxxxxx-xxxxxxx]? : ");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("입력 오류!!");
			sc.close();
			return; // stop
		}

		tot = 0;

		for (i = 0; i < 12; i++) {

			if (i >= 6) { // 뒷자리
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2)); // - 건너뛰기
			} else { // 앞자리
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));
			}

		}

		su = 11 - tot % 11;
		su = su % 10;
		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("대한민국 국민입니다.");
		} else {
			System.out.println("넌 누구냐?");
		}

		sc.close();

	}

}
