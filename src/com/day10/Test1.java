package com.day10;

// 상속(부모가 자식한테 주는것)
// 1. 부모꺼는 내꺼다.
// 2. private로 선언한것은 상속이 안됨
// 3. protected로 선언한것은 상속이 가능
// 4. 내꺼는 내꺼다.
// 5. 부모와 같은 객체를 가지고있다면 내꺼를 쓴다.(오버라이딩)

class SuperC {

	private String title;
	private int area;

	public void set(String title, int area) {
		this.title = title;
		this.area = area;
	}

	public void print() {
		System.out.println(title + " : " + area);
	}

}

class Rect extends SuperC {

	private int w, h;

	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void rectArea() {
		int a = w * h;
		set("사각형", a); // 1. 부모꺼는 내꺼다.
	}

}

public class Test1 {

	public static void main(String[] args) {
		
		Rect ob = new Rect(10, 20);
		ob.rectArea();
		ob.print(); // 1. 부모꺼는 내꺼다.
		

	}

}
