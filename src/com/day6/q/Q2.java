package com.day6.q;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {

//		2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
//		   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)

		int n1, n2, i = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		char ch = 0;

		do {
			
			if (i != 0) {
				System.out.println("--------------------------------");
			}
			
			n1 = rd.nextInt(10) + 1;
			i = 0;
			
			while (i < 3) {
				
				i++;
				System.out.printf("���� �Է�[%d��° ��ȸ] : ", i);
				n2 = sc.nextInt();
				
				if (n1 == n2) {
					System.out.println("�¾Ҿ��!!");
					break;
				} else {
					System.out.println("Ʋ�Ⱦ��!!");
				}
				
			}
			
			System.out.printf("������ %d�Դϴ�.\n", n1);
			
			do {
				
				System.out.print("����ҷ�?[Y/N] ");
				ch = (char) System.in.read();
				System.in.skip(2);
				
			} while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');
			
		} while (ch == 'Y' || ch == 'y');

		System.out.println("���α׷� ����");

		sc.close();

	}

}
