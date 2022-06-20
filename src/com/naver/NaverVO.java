package com.naver;

public class NaverVO {

	private String id, pw, name, email, gender;
	private int birth, tel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String string) {
		this.gender = string;
	}

	@Override
	public String toString() {
		String str = String.format("ID : %s, 이름 : %s, 성별 %s\n생일 : %d, 이메일 : %s, 전화번호 : %d", id, name, gender, birth, email, tel);
		return str;
	}
	
}
