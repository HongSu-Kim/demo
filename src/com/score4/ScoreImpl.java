package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);
	String hak;

	@Override
	public void input() {

		System.out.print("�й�? ");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("�й��� �����մϴ�. �߰� ����!!");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�? ");
		vo.setName(sc.next());
		System.out.print("����? ");
		vo.setKor(sc.nextInt());
		System.out.print("����? ");
		vo.setEng(sc.nextInt());
		System.out.print("����? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);
		System.out.println("�߰� ����!!");
	}

	@Override
	public boolean searchHak(String hak) {

//		if (hMap.containsKey(hak))
//			return true;
//		return false;

		return hMap.containsKey(hak);

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			System.out.println(hak + " " + vo.toString()); // vo.String() ��� vo�� ���൵ Override�� toString�� �ڵ����� ����Ѵ�
		}

	}

	@Override
	public void delete() {

		System.out.print("������ �й�? ");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}

	}

	@Override
	public void update() {

		System.out.print("������ �й�? ");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("���� ����");
			return;
		}

		ScoreVO vo = hMap.get(hak);
		System.out.print("����? ");
		vo.setKor(sc.nextInt());
		System.out.print("����? ");
		vo.setEng(sc.nextInt());
		System.out.print("����? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);
		System.out.println("���� ����");

	}

	@Override
	public void findHak() {

		System.out.print("�й�? ");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("�˻� ����");
			return;
		}

		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());

	}

	@Override
	public void findName() {

		System.out.print("�̸�? ");
		String name = sc.next();

		boolean flag = false;

		Iterator<String> it = hMap.keySet().iterator();
		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			if (name.equals(vo.getName())) {
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}

		}

		if (flag) {
			System.out.println("�˻� ����");
		} else {
			System.out.println("�˻� ����");
		}

	}

}
