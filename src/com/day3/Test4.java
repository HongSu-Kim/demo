package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// ���
		// if, �ݺ���(for,while,do~while), switch

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String str = null; // null�� �ʰ�ȭ // str = ""�� ����

		System.out.print("�� �Է�? ");
		num = Integer.parseInt(br.readLine());

		// ���� if�� : ���� 1, �۾� 1
		// if(���ǽ�){�۾�}

//		if (num % 2 == 0) {
//			str = "¦��";
//		}
//
//		if (num % 2 != 0) {
//			str = "Ȧ��";
//		}

		// if~else
		if (num % 2 == 0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}

		System.out.println(num + " : " + str);

	}

}
