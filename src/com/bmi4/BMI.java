package com.bmi4;

import java.io.IOException;

public interface BMI {

	public void printHome() throws IOException; // home 출력

	public void add() throws IOException; // 추가

	public void bmi(); // bmi 계산

	public void printProfile(); // 출력

	public void delete() throws IOException; // 삭제

	public void update() throws IOException; // 수정

	public void findName() throws IOException; // 검색
	
	public void sort(); // 정렬

}
