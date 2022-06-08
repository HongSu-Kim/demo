package com.day7;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class D6T8 {

	Scanner sc = new Scanner(System.in);
	int user, rg;

	public int com() {

		Random rd = new Random();
		return rd.nextInt(3);

	}

	public int inputUser() {

		do {

			System.out.print("1:가위, 2:바위, 3:보 ?");
//			char ch = (char) System.in.read();
//			System.in.skip(2);
//			user = ch - 49;
			try {
				user = Integer.parseInt(sc.nextLine()) - 1;
			} catch (NumberFormatException e) {
				user = -1;
			}

		} while (user < 0 || user > 2);

		return user;

	}

	public String result(int com, int user) {

		if (com == user)
			return "무승부입니다.";
		else if ((user + 2) % 3 == com)
			return "사람이 이겼습니다.";
		else if ((user + 1) % 3 == com)
			return "컴퓨터가 이겼습니다.";
		return null;

	}

	public void print(int com, int user, String result) {

		String[] str = { "가위", "바위", "보" };
		System.out.println("사람 : " + str[user] + ", 컴퓨터 : " + str[com]);
		System.out.println(result);

	}

	public int reGame() throws IOException {

		System.out.print("계속[Y/N] ?");
		char ch = (char) System.in.read();
		System.in.skip(2);
		if (ch == 'Y' || ch == 'y') {
			rg = 1;
		} else if (ch == 'N' || ch == 'n') {
			rg = 0;
		} else {
			reGame();
		}

		return rg;

	}

}

public class Day6_Test8 {

	public static void main(String[] args) throws IOException {

		D6T8 ob = new D6T8();

		do {
			int com = ob.com();
			int user = ob.inputUser();
			String result = ob.result(com, user);
			ob.print(com, user, result);
		} while (ob.reGame() == 1);

	}

}
