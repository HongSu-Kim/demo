package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		// �غ�(w)�� ����(h)�� �Է¹޾� �ﰢ���� ����(a) ���ϱ�
		// �غ�? 23.5
		// ����? 34.7
		// ���� : xxx.xxx
		// ���� = �غ� * ���� / 2

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double w, h, a;

		// �Է�
		System.out.print("�غ�? ");
		w = Double.parseDouble(br.readLine());
		System.out.print("����? ");
		h = Double.parseDouble(br.readLine());

		// ����
		a = w * h / 2;

		// ���
		System.out.println("���� : " + a);

		/*
		 * int
		 * 
		 * //���� BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); int w,h; double a;
		 * 
		 * //�Է� System.out.print("�غ�? "); w = Integer.parseInt(br.readLine());
		 * System.out.print("����? "); h = Integer.parseInt(br.readLine());
		 * 
		 * //���� a = w * h / 2.0; //w,h�� �����̱⶧���� 2(int)�� ������ ����*����/����=������ �Ǳ⶧����
		 * 2.0(double)�� ������ ����*����/�Ǽ�=�Ǽ��� ������ش�.
		 * 
		 * //��� System.out.println("���� : " + a);
		 * 
		 */

		/*
		 * float
		 * 
		 * //���� BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); float w,h,a;
		 * 
		 * //�Է� System.out.print("�غ�? "); w = Float.parseFloat(br.readLine());
		 * System.out.print("����? "); h = Float.parseFloat(br.readLine());
		 * 
		 * //���� a = w * h / 2;
		 * 
		 * //��� System.out.println("���� : " + a);
		 * 
		 */

	}

}
