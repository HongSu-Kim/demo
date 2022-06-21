package com.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SelectMember extends Thread {

	static Random rd = new Random();

	private static String[] name = { "������", "�ȼ���", "����", "�輺��", "���ٿ�", "������", "�̵���", "������", "��ȫ��", "������", "������", "������",
			"�ڼ���", "������", "��â��", "�����", "������", "�ڼ���", "������", "�ɹ���", "��ä��", "�迵��", "�Ƚÿ�", "������", "�ڼ���", "������", "������" };

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
			System.out.print("��ǥ�� �ο���? ");
			n = Integer.parseInt(br.readLine());
		} while (n < 1 || n > name.length);
		number = new int[n];

		System.out.print("�����...");

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

		System.out.println("\n\n�����մϴ�!!, ��ǥ�� �Դϴ�.\n");
		for (int j = 0; j < n; j++) {
			System.out.println((j + 1) + "�� ��ǥ�� : " + name[number[j]]);

		}

	}

}
