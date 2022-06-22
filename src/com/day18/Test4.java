package com.day18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4 {

	public static void main(String[] args) throws IOException {

		int data;

		System.out.print("문자열 입력? ");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);

		while ((data = rd.read()) != -1) {

			wr.write(data); // 버퍼에 담아서 버퍼가 가득차면 내보냄
			wr.flush(); // 버퍼가 가득차지 않아도 강제로 내보냄

		}

	}

}
