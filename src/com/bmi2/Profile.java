package com.bmi2;

public class Profile {
	
	String name, result;
	double weight, height, bmi;
	private static int serialNum;
	int ID;
	
	public static int getSerialNum() {
		return ++serialNum;
	}
	
	
	
}
