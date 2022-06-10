package com.day10;

// ���(�θ� �ڽ����� �ִ°�)
// 1. �θ𲨴� ������.
// 2. private�� �����Ѱ��� ����� �ȵ�
// 3. protected�� �����Ѱ��� ����� ����
// 4. ������ ������.
// 5. �θ�� ���� ��ü�� �������ִٸ� ������ ����.(�������̵�)

class SuperB {

	private String title;
	protected int area;

	public void set(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println(title + " : " + area);
	}

}

class RectB extends SuperB {

	private int w, h;

	public RectB(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void rectArea() {
		area = w * h; // 3. protected�� �����Ѱ��� ����� ����
		set("�簢��"); // 1. �θ𲨴� ������.
	}

}

public class Test2 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(100, 200);
		ob.rectArea();
		ob.print(); // 1. �θ𲨴� ������.
		

	}

}
