package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test4 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;

	public Test4() {

		ta = new TextArea();
		add(ta);

		tf = new TextField("https://");
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("HTML Viewer");
		setSize(400, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Test4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			String str;
			URL url = new URL(tf.getText()); // tf에 사용자가 입력한 값을 url로 가져옴

			ta.setText(""); // 기존데이터 초기화

			// 방법1
//			InputStream is = url.openStream(); // url로 가서 들어오는 스트림을 is에 담아둠
//			BufferedReader br = new BufferedReader(new InputStreamReader(is)); // 네트워크로 들어오는 데이터를 1byte씩 읽어서 br에 할당

			// 방법2
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {

				if (ta.getText().equals("")) {
					ta.setText(str);
				} else {
					ta.setText(ta.getText() + "\r\n" + str);// 기존 텍스트를 읽어와서 누적해서 출력해라 append와 동일
				}

			}

			is.close();

		} catch (Exception e1) {
		}
	}

}
