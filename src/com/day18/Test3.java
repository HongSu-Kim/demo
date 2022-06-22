package com.day18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader
// 1byte의 stream을 2byte의 stream으로 변환
// Bridge stream : 데이터를 전달만 해주고 자신이 가지고있을수없다.

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("문자열 입력? ");

		Reader rd = new InputStreamReader(System.in);

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.print(ch);
		}

	}

}
