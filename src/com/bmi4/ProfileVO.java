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
		String str = String.format("ȸ����ȣ : %4d, �̸� :%6s, ������ :%6.2fkg, Ű :%6.2fcm, BMI :%4.2f\n", ID, name, weight,
				height, bmi);
		return str;
	}

	public String toStringBMI() {
		String str = String.format("ȸ����ȣ : %4d, �̸� :%6s\n������ :%6.2fkg, Ű :%6.2fcm\nBMI(��ü��������)�� %4.2f�̰�, %s�Դϴ�.\n", ID,
				name, weight, height, bmi, result);
		return str;
	}

}
