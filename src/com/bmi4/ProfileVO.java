package com.bmi4;

public class ProfileVO {

	private String name, result;
	private double weight, height, bmi;
	private static int serialNum = 1000;
	private int ID;

	public ProfileVO() {
		ID = ++serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		String str = String.format("회원번호 : %4d, 이름 :%6s, 몸무게 :%6.2fkg, 키 :%6.2fcm, BMI :%4.2f\n", ID, name, weight,
				height, bmi);
		return str;
	}

	public String toStringBMI() {
		String str = String.format("회원번호 : %4d, 이름 :%6s\n몸무게 :%6.2fkg, 키 :%6.2fcm\nBMI(신체질량지수)는 %4.2f이고, %s입니다.\n", ID,
				name, weight, height, bmi, result);
		return str;
	}

}
