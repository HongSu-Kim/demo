package com.bmi2;

public class Record {
	
	String name, result;
	double weight, height, bmi;
	private static int serialNum;
	int ID;
	
	public static int getSerialNum() {
		return ++serialNum;
	}
	
	
	
}
