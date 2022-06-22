package com.day18;

import java.io.IOException;

// Stream
// 데이터 입출력시 모든 데이터의 형태와는 관련없이 단방향 흐름으로 데이터를 전송하는 클래스

// in.read, out.print
// in : 기본 입력 스트림(바이트 스트림)

public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;

		System.out.print("문자열? ");
		while ((data = System.in.read()) != -1) { // 읽을 값이 없을때까지

			char ch = (char) data;
			System.out.print(ch);

		}

	}

}
