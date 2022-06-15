package com.day13;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() { // 기본생성자
	}

	public TestImpl(String hak, String name, int kor, int eng) { // 생성자
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) { // 초기화 메소드
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + " : " + name + " : " + total());
	}

	@Override
	public boolean equals(Object ob) { // TestImpl ob1.equals(ob2) TestImpl // upcast : ob2를 TestImpl에서 Object로 upcast
										// equals : 다형성을 위해 Object로 받음
		boolean flag = false;

		if (ob instanceof TestImpl) {
			TestImpl t = (TestImpl) ob; // downcast : ob를 Object에서 TestImpl로 downcast
			if (this.hak.equals(t.hak) && name.equals(t.name)) // override : String의 equals
				flag = true;
		}

		return flag;

	}

}

public class Test2 {

	public static void main(String[] args) {

		TestImpl ob1 = new TestImpl("1111", "배수지", 80, 90);
		Test ob2 = new TestImpl("1111", "배수지", 100, 100); // Test의 변수와 메소드만 사용했기 떄문에 Test로 만들어줘도 됨

		if (ob1.equals(ob2))
			System.out.println("ob1과 ob2는 동일인물");
		else
			System.out.println("ob1과 ob2는 안동일인물");

		ob1.write();
		ob2.write();

	}

}
