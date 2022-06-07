package com.day6;

import com.day7.Rect; // 패키지가 다르면 class를 불러와야한다.

public class Usa {

	public static void main(String[] args) {

		Rect ob = new Rect();

		ob.input();
		int a = ob.area();
		int l = ob.length();
		ob.print(a, l);

	}

}
