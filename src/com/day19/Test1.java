package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// AWT(Abstract Window Toolkit) -> Swing -> FX

public class Test1 extends Frame implements WindowListener { // WindowListener : 필요없는 메도스까지 오버라이딩해야해서 안씀

	private static final long serialVersionUID = 1L;

	public Test1() {
		
		setTitle("자바 윈도우");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));

		addWindowListener(this); // 감시자를 윈도우에 추가
		
		setVisible(true); // 창을 보여줌

	}

	public static void main(String[] args) {

		new Test1();

	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) { // X버튼 클릭
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
