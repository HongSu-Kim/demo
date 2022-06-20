package com.naver;

import java.io.IOException;

public interface Naver {

	public void printMain() throws IOException, NaverException;

	public void SignUp() throws IOException, NaverException;

	public void chackId() throws IOException;

	public void chackPw() throws IOException, NaverException;

	public void chackName() throws IOException;

	public void chackGender() throws IOException, NaverException;

	public void chackBirth() throws IOException, NaverException;

	public void chackEmail() throws IOException, NaverException;

	public void chacktel() throws IOException, NaverException;

	public void print();

	public void findId() throws IOException, NaverException;

}
