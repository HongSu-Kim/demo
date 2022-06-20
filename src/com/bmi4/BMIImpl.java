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
			System.out.println("잘못 입력");
		}

		return input;

	}

	@Override
	public void printHome() throws IOException {
		System.out.print("1.입력 2.출력 3.삭제 4.수정 5.검색 6.정렬 7.종료: ");
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
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
	}

	@Override
	public void add() throws IOException {

		vo = new ProfileVO();

		System.out.print("이름? ");
		vo.setName(br.readLine());
		addWH();
		bmi();

		hMap.put(vo.getID(), vo);

	}

	public void addWH() throws IOException {

		do {
			System.out.print("몸무게? ");
			try {
				vo.setWeight(Double.parseDouble(br.readLine()));
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력");
			}
		} while (vo.getWeight() < 1 || vo.getWeight() > 300);
		do {
			System.out.print("키? ");
			try {
				vo.setHeight(Double.parseDouble(br.readLine()));
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력");
			}
		} while (vo.getHeight() < 1 || vo.getHeight() > 300);

	}

	@Override
	public void bmi() {

		vo.setBmi(vo.getWeight() / vo.getHeight() * vo.getWeight());

		if (vo.getBmi() < 18.5)
			vo.setResult("저체중");
		else if (vo.getBmi() < 23.0)
			vo.setResult("정상");
		else if (vo.getBmi() < 25)
			vo.setResult("과체중");
		else
			vo.setResult("비만");

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

		System.out.print("삭제할 회원번호? ");
		int id = input(1000);

		if (hMap.containsKey(id)) {
			hMap.remove(id);
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}

	}

	@Override
	public void update() throws IOException {

		System.out.print("회원번호? ");

		int id = input(2000);
		if (!hMap.containsKey(id)) {
			System.out.println("수정 실패(없는 회원번호)");
			return;
		}

		vo = hMap.get(id);
		addWH();
		bmi();
		System.out.println(vo.toStringBMI());

	}

	@Override
	public void findName() throws IOException {

		System.out.print("이름? ");
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
