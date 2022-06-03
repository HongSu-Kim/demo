package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name, pan;
		int kor;

		System.out.print("이름? ");
		name = sc.next();
		System.out.print("국어? ");
		kor = sc.nextInt();

		if (kor >= 90) {
			pan = "수";
		} else if (kor >= 80) {
			pan = " 우";
		} else if (kor >= 70) {
			pan = "미";
		} else if (kor >= 60) {
			pan = "양";
		} else {
			pan = "가";
		}

		System.out.println(name + "의 국어 점수는 " + kor + "점 이고 환산점수는 " + pan + "입니다.");

		sc.close(); // 쓰는게 정석이지만 안써줘도 오류가 나지는 않는다.

	}

}
