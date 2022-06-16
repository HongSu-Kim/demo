package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out.print("\n1.입력 2.출력 3.학생정보삭제 4.학번검색 5.이름검색 6.총점내림차순정렬 7.학번오름차순정렬 8.종료 : ");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.deleteHak();
				break;
			case 4:
				ob.searchHak();
				break;
			case 5:
				ob.searchName();
				break;
			case 6:
				ob.descSortTot();
				break;
			case 7:
				ob.ascSortHak();
				break;
			default:
				System.out.println("학사정보 시스템을 종료합니다.");
				System.exit(0);
			}

		}

	}

}
