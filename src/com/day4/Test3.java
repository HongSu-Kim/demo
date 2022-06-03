package com.day4;

public class Test3 {

	public static void main(String[] args) {

		int n, sum;
		sum = 0;

		// 100±îÁöÀÇ ÇÕ
		for (n = 1; n <= 100; n++) {
			sum += n;
		}
		System.out.println("1~ 100±îÁöÀÇ ÇÕ : " + sum);

		sum = 0;

		// È¦¼öÀÇ ÇÕ
		for (n = 1; n <= 100; n += 2) {
			sum += n;
		}
		System.out.println("È¦¼öÀÇ ÇÕ : " + sum);

		sum = 0;

		// Â¦¼öÀÇ ÇÕ
		for (n = 2; n <= 100; n += 2) {
			sum += n;
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : " + sum);

		int cnt = 0;

		// È¦¼öÀÇ °¹¼ö
		for (n = 1; n <= 100; n++) {
			if (n % 2 != 0)
				cnt++;
		}
		System.out.println("È¦¼öÀÇ °¹¼ö : " + cnt);

	}

}
