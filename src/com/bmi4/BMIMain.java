package com.bmi4;

import java.io.IOException;

public class BMIMain {

	public static void main(String[] args) throws IOException {

		BMIImpl ob = new BMIImpl();

		while (true) {
			ob.printHome();
		}

	}

}
