package com.day18;

import java.io.FileInputStream;

// 파일 입출력

// FileInputStream

public class Test5 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");

			int data;
			while ((data = fis.read()) != -1) {

//				System.out.println((char) data);
				System.out.write(data); // enter가 나올때마다 내보냄
				System.out.flush(); // 마지막에 enter가 없어서 버퍼에 남아있는걸 내보내줌

			}

			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
