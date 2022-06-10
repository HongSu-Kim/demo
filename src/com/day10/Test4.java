package com.day10;

class Super {

	private String title;
	protected double area;

	public Super() { // �⺻������ Recta()
	}

	public Super(String title) { // �����ε� ������ Circle(int r)
		this.title = title;
	}

	public void write() {
		System.out.println(title + " : " + area);
	}

}

class Circle extends Super {

	private int r;
	protected static final double PI = 3.14;

	public Circle(int r) {
		super("��");
		this.r = r;
	}

	public void circleArea() {
		area = r * r * PI;
	}

}

class Recta extends Super {

	private int w, h;

//	public Recta() { // �⺻������ ����
//		super();
//	}

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		area = w * h;
	}

	// Override
	// ����Ŭ������ ���ǵǾ��ִ� �޼ҵ带 �������Ѵ�(������)
	@Override // ������̼�(annotation) : �������̵��� �޼ҵ尡 ���� ������ Ȯ��
	public void write() { // 5. �θ�� ���� ��ü�� �������ִٸ� ������ ����.(�������̵�)
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + area);
	}
	
}

public class Test4 {

	public void main(String[] args) {

		Circle c = new Circle(10);
		c.circleArea();
		c.write();

		Recta r = new Recta();
		r.rectArea(10, 20);
		r.write();

	}

}
