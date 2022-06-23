package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test2() {

		setTitle("������");
		setSize(200, 300);
		
		addWindowListener(new MyWindowAdapter()); // MyWindowAdapter�� �����Ǵ����� ����
		
		setVisible(true);

	}

	class MyWindowAdapter extends WindowAdapter { // ����Ŭ���� : ���������� 

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		new Test2();

	}

}
