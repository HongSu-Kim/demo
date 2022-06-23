package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test3() {

		setTitle("윈도우");
		setSize(200, 300);

		addWindowListener(new WindowAdapter() { // 무명의 클래스 : 한번만쓸때

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Test3();

	}

}
