package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] str = { "가위", "바위", "보" };
		int com, user;

		com = rd.nextInt(3);

		do {
			System.out.print("1:가위, 2:바위, 3:보 ?");
			user = sc.nextInt() - 1;
		} while (user < 0 || user > 2);

		System.out.println("사람 : " + str[user] + ", 컴퓨터 : " + str[com]);

		String result = "";

		if (com == user)
			result = "무승부입니다.";
		else if ((user + 2) % 3 == com)
			result = "사람이 이겼습니다.";
		else if ((user + 1) % 3 == com)
			result = "컴퓨터가 이겼습니다.";

		System.out.println(result);

		sc.close();

	}

}
