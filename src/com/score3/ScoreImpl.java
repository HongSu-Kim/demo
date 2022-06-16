package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<>(); // ScoreVO�ڷ����� ������ List(collection)����, ������ lists

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() { // DB�� �����Ҷ� ���强�����θ� return����

		int result = 0;

		ScoreVO vo = new ScoreVO(); // ScoreVO�ڷ����� ������ vo�� ����

		System.out.print("�й�? ");
		vo.setHak(sc.next());
		System.out.print("�̸�? ");
		vo.setName(sc.next());
		System.out.print("����? ");
		vo.setKor(sc.nextInt());
		System.out.print("����? ");
		vo.setEng(sc.nextInt());
		System.out.print("����? ");
		vo.setMat(sc.nextInt());

		lists.add(vo); // lists�� vo�� �߰�

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

		System.out.print("������ �й�? ");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (hak.equals(vo.getHak())) { // hak(�Է��� hak)�� vo.getHak()(lists�� ����� hak�� ������� �ҷ���)�� ������
				it.remove(); // lists�� ����� ScoreVO�� ����
				System.out.println("�����Ǿ����ϴ�.");
				return; // �޼ҵ� ����
			}

		}

		System.out.println("���� �й�"); // ���� ã�����ؼ� return�� �������� ���ϸ� �����

	}

	@Override
	public void searchHak() {

		System.out.print("�˻��� �й�? ");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (hak.equals(vo.getHak())) {
				System.out.println(vo.toString());
				break; // �ݺ��� ���� // �й��� �ߺ����� �ʴ´ٴ� �����Ͽ� �� ������ �˻����� ����
						// �ݺ��� ���� �ڵ尡������ return�� ����ص� ��
			}

		}

	}

	@Override
	public void searchName() {

		System.out.print("�˻��� �̸�? ");
		String name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (name.equals(vo.getName())) {
				System.out.println(vo.toString()); // ���������� �����Ҽ��ֱ� ������ �ݺ����� ���������ʰ� ������ ����
			}

		}

	}

	@Override
	public void descSortTot() { // ������������

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() { // comp�� ����// anonymousClass

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp); // �������� : comp

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
