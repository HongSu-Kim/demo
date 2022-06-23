package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test2() {

		setTitle("윈도우");
		setSize(200, 300);
		
		addWindowListener(new MyWindowAdapter()); // MyWindowAdapter가 생성되는지를 감시
		
		setVisible(true);

	}

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
