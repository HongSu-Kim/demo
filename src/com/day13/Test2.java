package com.day13;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() { // �⺻������
	}

	public TestImpl(String hak, String name, int kor, int eng) { // ������
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) { // �ʱ�ȭ �޼ҵ�
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
	public boolean equals(Object ob) { // TestImpl ob1.equals(ob2) TestImpl // upcast : ob2�� TestImpl���� Object�� upcast
										// equals : �������� ���� Object�� ����
		boolean flag = false;

		if (ob instanceof TestImpl) {
			TestImpl t = (TestImpl) ob; // downcast : ob�� Object���� TestImpl�� downcast
			if (this.hak.equals(t.hak) && name.equals(t.name)) // override : String�� equals
				flag = true;
		}

		return flag;

	}

}

public class Test2 {

	public static void main(String[] args) {

		TestImpl ob1 = new TestImpl("1111", "�����", 80, 90);
		Test ob2 = new TestImpl("1111", "�����", 100, 100); // Test�� ������ �޼ҵ常 ����߱� ������ Test�� ������൵ ��

		if (ob1.equals(ob2))
			System.out.println("ob1�� ob2�� �����ι�");
		else
			System.out.println("ob1�� ob2�� �ȵ����ι�");

		ob1.write();
		ob2.write();

	}

}
