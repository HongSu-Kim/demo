package com.naver;

import java.io.IOException;

public class NaverMain {

	public static void main(String[] args) throws NaverException, IOException {

		NaverImpl ob = new NaverImpl();

		while (true) {
			ob.printMain();
		}

	}

}
