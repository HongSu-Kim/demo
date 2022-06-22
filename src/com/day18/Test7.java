package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// 파일복사
		// 원본파일? c:\\doc\\test.txt
		// 대상파일? c:\\doc\\out.txt
		// 복사완료

		Scanner sc = new Scanner(System.in);

		FileInputStream fis;
		FileOutputStream fos;

		int data;

		try {

			System.out.println("파일복사");
			System.out.print("원본파일? ");
			fis = new FileInputStream(sc.next());
			System.out.print("대상파일? ");
			fos = new FileOutputStream(sc.next());

			sc.close();

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("복사완료");

		} catch (Exception e) {
		}

	}

}
