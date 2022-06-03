package com.day3.q;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1.Á¤¼ö¸¦ ÀÔ·Â ¹Þ¾Æ¼­ Â¦¼ö, È¦¼ö¸¦ ±¸º°ÇØ¼­ Ãâ·Â.
//		¿¹) 3 ÀÔ·Â½Ã -> 3 => È¦¼ö
//		¿¹) 4 ÀÔ·Â½Ã -> 4 => Â¦¼ö

		Scanner sc = new Scanner(System.in);

		int num;
		String str;

		System.out.print("¼ö ÀÔ·Â ");
		num = sc.nextInt();

//		if (num % 2 == 0) {
//			str = "Â¦¼ö";
//		} else
//			str = "È¦¼ö";

		str = num % 2 == 0 ? "Â¦¼ö" : "È¦¼ö";

		System.out.println(num + " => " + str);

		sc.close();

	}

}
