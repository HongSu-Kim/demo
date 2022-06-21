package com.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SelectMember extends Thread {

	static Random rd = new Random();

	private static String[] name = { "오세라", "안수언", "엄희성", "김성현", "윤다영", "김희진", "이동우", "최재혁", "김홍수", "서수현", "윤재일", "정영진",
			"박선미", "전은지", "류창주", "김수지", "이은지", "박수정", "정성경", "심민정", "윤채련", "김영운", "안시연", "이정민", "박수진", "윤서혜", "정민정" };

	@Override
	public void run() {

		try {
			for (int i = 0; i < rd.nextInt(10) + 5; i++) {
				sleep(500);
				System.out.print(".");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		int[] number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SelectMember ob = new SelectMember();

		int n;
		do {
			System.out.print("발표자 인원수? ");
			n = Integer.parseInt(br.readLine());
		} while (n < 1 || n > name.length);
		number = new int[n];

		System.out.print("고민중...");

		ob.start();

		ob.join();

		int i = 0;
		while (i < n) {
			number[i] = rd.nextInt(name.length);
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j])
					i--;
			}
			i++;
		}

		System.out.println("\n\n축하합니다!!, 발표자 입니다.\n");
		for (int j = 0; j < n; j++) {
			System.out.println((j + 1) + "번 발표자 : " + name[number[j]]);

		}

	}

}
