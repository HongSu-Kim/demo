package com.day10;

class Super {

	private String title;
	protected double area;

	public Super() { // 기본생성자 Recta()
	}

	public Super(String title) { // 오버로딩 생성자 Circle(int r)
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
		super("원");
		this.r = r;
	}

	public void circleArea() {
		area = r * r * PI;
	}

}

class Recta extends Super {

	private int w, h;

//	public Recta() { // 기본생성자 생략
//		super();
//	}

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		area = w * h;
	}

	// Override
	// 상위클래스에 정의되어있는 메소드를 재정의한다(다형성)
	@Override // 어노테이션(annotation) : 오버라이딩된 메소드가 문제 없는지 확인
	public void write() { // 5. 부모와 같은 객체를 가지고있다면 내꺼를 쓴다.(오버라이딩)
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + area);
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
