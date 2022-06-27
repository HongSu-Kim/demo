package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test2() {

		setTitle("윈도우");
		setSize(200, 300);

		addWindowListener(new MyWindowAdapter()); // MyWindowAdapter를 생성하고 감시

		setVisible(true);

	}

	// WindowAdapter : WindowListener와는 달리 원하는 메소드만 오버라이딩한다.
	// 인터페이스가 아닌 클래스이기때문에 내부클래스로(여러번 쓸때) 만들어준다.
	class MyWindowAdapter extends WindowAdapter { // 내부클래스 : 여러번쓸때

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		new Test2();

	}

}
