package com.score3;

public interface Score {

	public int input();

	public void print();
	
	public void deleteHak(); // 학생정보삭제

	public void searchHak(); // 학번검색

	public void searchName(); // 이름 검색

	public void descSortTot(); // 총점 내린차순 정렬

	public void ascSortHak(); // 학번 오름차순 정렬

}
