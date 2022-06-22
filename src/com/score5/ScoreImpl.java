package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	File f = new File("c:\\doc\\ScoreVO.txt");
	Scanner sc = new Scanner(System.in);
	List<ScoreVO> list;
	ScoreVO vo;

	@SuppressWarnings({ "unchecked", "resource" })
	public ScoreImpl() throws ClassNotFoundException, IOException {
		
		if (!f.exists()) {
			list = new ArrayList<>();
		} else {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			try {
				list = (List<ScoreVO>) ois.readObject();
			} catch (Exception e) {
			}
			
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

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(list);
		oos.close();

	}

}
