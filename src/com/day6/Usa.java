package com.day6;

import com.day7.Rect; // ��Ű���� �ٸ��� class�� �ҷ��;��Ѵ�.

public class Usa {

	public static void main(String[] args) {

		Rect ob = new Rect();

		ob.input();
		int a = ob.area();
		int l = ob.length();
		ob.print(a, l);

	}

}
