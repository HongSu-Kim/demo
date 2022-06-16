package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<>(); // ScoreVO자료형을 가지는 List(collection)생성, 변수명 lists

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() { // DB에 저장할때 저장성공여부를 return받음

		int result = 0;

		ScoreVO vo = new ScoreVO(); // ScoreVO자료형을 가지는 vo를 생성

		System.out.print("학번? ");
		vo.setHak(sc.next());
		System.out.print("이름? ");
		vo.setName(sc.next());
		System.out.print("국어? ");
		vo.setKor(sc.nextInt());
		System.out.print("영어? ");
		vo.setEng(sc.nextInt());
		System.out.print("수학? ");
		vo.setMat(sc.nextInt());

		lists.add(vo); // lists에 vo를 추가

		return result;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {

			ScoreVO vo = it.next();

//			System.out.printf("%5s %6s %4d %4d %4d %4d %6.1f\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(),
//					vo.getMat(), (vo.getKor() + vo.getEng() + vo.getMat()),
//					(vo.getKor() + vo.getEng() + vo.getMat()) / 3);

			System.out.println(vo.toString());

		}

	}

	@Override
	public void deleteHak() {

		System.out.print("삭제할 학번? ");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (hak.equals(vo.getHak())) { // hak(입력한 hak)과 vo.getHak()(lists에 저장된 hak을 순서대로 불러옴)이 같을때
				it.remove(); // lists에 저장된 ScoreVO를 삭제
				System.out.println("삭제되었습니다.");
				return; // 메소드 종료
			}

		}

		System.out.println("없는 학번"); // 값을 찾지못해서 return을 실행하지 못하면 실행됨

	}

	@Override
	public void searchHak() {

		System.out.print("검색할 학번? ");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (hak.equals(vo.getHak())) {
				System.out.println(vo.toString());
				break; // 반복문 종료 // 학번이 중복되지 않는다는 전제하에 뒷 값들은 검색하지 않음
						// 반복문 이후 코드가없으면 return을 사용해도 됨
			}

		}

	}

	@Override
	public void searchName() {

		System.out.print("검색할 이름? ");
		String name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (name.equals(vo.getName())) {
				System.out.println(vo.toString()); // 동명이인이 존재할수있기 때문에 반복문을 종료하지않고 끝까지 진행
			}

		}

	}

	@Override
	public void descSortTot() { // 내림차순정렬

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() { // comp를 정의// anonymousClass

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp); // 정렬조건 : comp

		print();

	}

	@Override
	public void ascSortHak() {

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() { // anonymousClass

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				boolean result = false;
				for (int i = 0; i < vo1.getHak().length(); i++) {
					if (vo1.getHak().charAt(i) > vo2.getHak().charAt(i)) {
						result = true;
						break;
					} else if (vo1.getHak().charAt(i) < vo2.getHak().charAt(i)) {
						result = false;
						break;
					}
				}

				return result ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

		print();

	}

}
