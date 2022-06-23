package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	List<ScoreVO> list;
	private String path = System.getProperty("user.dir"); // C:\\java\\work\\demo
	File f = new File(path, "\\data\\Score.txt");
	Scanner sc = new Scanner(System.in);
	ScoreVO vo;

	@SuppressWarnings({ "resource", "unchecked" })
	public ScoreImpl() throws Exception {

		try {

			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				list = (List<ScoreVO>) ois.readObject();
			}

		} catch (Exception e) {
		}

	}

	@Override
	public void input() {

		vo = new ScoreVO();

		System.out.print("이름? ");
		vo.setName(sc.next());
		System.out.print("생일? ");
		vo.setBirth(sc.next());
		System.out.print("점수? ");
		vo.setScore(Integer.parseInt(sc.next()));

		// 처음실행후 데이터 입력시 객체를 생성
		if (list == null) {
			list = new ArrayList<>();
		}

		list.add(vo);

	}

	public void inputName() {

	}

	public void inputBirth() {

	}

	public void inputScore() {

	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

	@Override
	public void exit() throws Exception {

		try {

			if (list == null)
				return;

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(list);
			oos.close();

		} catch (Exception e) {
		}
	}

}
