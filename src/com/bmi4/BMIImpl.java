package com.bmi4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BMIImpl implements BMI {

	private Map<Integer, ProfileVO> hMap = new HashMap<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ProfileVO vo;

	public int input(int n) throws IOException {

		int input = 0;
		try {
			input = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
		}

		if (input < 1 || input > n) {
			System.out.println("�߸� �Է�");
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {
		System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.�˻� 6.���� 7.����: ");
		int n = input(7);

		switch (n) {
		case 1:
			add();
			break;
		case 2:
			printProfile();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			findName();
			break;
		case 6:
			sort();
			break;
		case 7:
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
	}

	@Override
	public void add() throws IOException {

		vo = new ProfileVO();

		System.out.print("�̸�? ");
		vo.setName(br.readLine());
		addWH();
		bmi();

		hMap.put(vo.getID(), vo);

	}

	public void addWH() throws IOException {

		do {
			System.out.print("������? ");
			try {
				vo.setWeight(Double.parseDouble(br.readLine()));
			} catch (NumberFormatException e) {
				System.out.println("�߸� �Է�");
			}
		} while (vo.getWeight() < 1 || vo.getWeight() > 300);
		do {
			System.out.print("Ű? ");
			try {
				vo.setHeight(Double.parseDouble(br.readLine()));
			} catch (NumberFormatException e) {
				System.out.println("�߸� �Է�");
			}
		} while (vo.getHeight() < 1 || vo.getHeight() > 300);

	}

	@Override
	public void bmi() {

		vo.setBmi(vo.getWeight() / vo.getHeight() * vo.getWeight());

		if (vo.getBmi() < 18.5)
			vo.setResult("��ü��");
		else if (vo.getBmi() < 23.0)
			vo.setResult("����");
		else if (vo.getBmi() < 25)
			vo.setResult("��ü��");
		else
			vo.setResult("��");

	}

	@Override
	public void printProfile() {

		Iterator<Integer> it = hMap.keySet().iterator();
		while (it.hasNext()) {
			vo = hMap.get(it.next());
			System.out.print(vo.toString());
		}

		System.out.println();

	}

	@Override
	public void delete() throws IOException {

		System.out.print("������ ȸ����ȣ? ");
		int id = input(1000);

		if (hMap.containsKey(id)) {
			hMap.remove(id);
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}

	}

	@Override
	public void update() throws IOException {

		System.out.print("ȸ����ȣ? ");

		int id = input(2000);
		if (!hMap.containsKey(id)) {
			System.out.println("���� ����(���� ȸ����ȣ)");
			return;
		}

		vo = hMap.get(id);
		addWH();
		bmi();
		System.out.println(vo.toStringBMI());

	}

	@Override
	public void findName() throws IOException {

		System.out.print("�̸�? ");
		String name = br.readLine();

		Iterator<Integer> it = hMap.keySet().iterator();
		while (it.hasNext()) {

			vo = hMap.get(it.next());
			if (name.equals(vo.getName())) {
				System.out.println(vo.toStringBMI());
			}

		}

	}

	@Override
	public void sort() {
		
		Comparator<ProfileVO> comp = new Comparator<ProfileVO>() {

			@Override
			public int compare(ProfileVO vo1, ProfileVO vo2) {
				return vo1.getBmi() > vo2.getBmi() ? 1 : -1;
			}
		};
		
		List<ProfileVO> lists = new ArrayList<>();
		
		Iterator<ProfileVO> it = hMap.values().iterator();
		while(it.hasNext()) {
			lists.add(it.next());
		}
		
		Collections.sort(lists, comp);
		
		it = lists.iterator();
		while(it.hasNext()) {
			vo = it.next();
			System.out.print(vo.toString());
		}
		
		System.out.println();
		
	}

}
