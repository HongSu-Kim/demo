package com.day4.q;

public class Q4 {

	public static void main(String[] args) {

//		4. 1���� 100������ ���� 3�� ����� ����
//		3�� ����� ���� : 33

		int cnt = 0;

		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				cnt++;
			}
			
		}

		System.out.println("3�� ����� ���� : " + cnt);

	}

}
