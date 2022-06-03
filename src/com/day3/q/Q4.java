package com.day3.q;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

//		4. 년도를 입력받고, 윤년인지 아닌지를 출력.
//		예) 2010 입력시 -> 2010 => 평년
//		    2012 입력시 -> 2012 => 윤년

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("수 입력 ");
		num = sc.nextInt();

		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
			System.out.println(num + " => 윤년");
		} else {
			System.out.println(num + " => 평년");
		}

		sc.close();

	}

}
