package com.day11;

// String : 자료형이 아니고 class이다.

// 저장할 데이터는 크고(스택영역이 아닌 힙영역에 저장한다) 사용빈도는 높기때문에
// String은 불변의 법칙을 가지고있다.(한번 만들어지면 값을 변경하지않는다, 값을 변경하면 클래스를 새로 만든다.)

public class Test2 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul"); // new를 사용하게되면 class를 새로 생성하게된다. (참조변수가 달라진다.)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // true
		System.out.println("ob1 == ob3 : " + (ob1 == ob3)); // false // ob1과 ob3의 참조변수값을 비교한다(Call By Reference)
		System.out.println("ob1.equals(ob3) : " + ob1.equals(ob3)); // true // String.equals(오버라이딩) : Call By Value

		ob2 = "Korea"; // Seoul을 Korea로 변경하는것이 아니라 새로운 클래스를 만들어서 Korea를 넣어준다.
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // 필요없어진 값은 가비지 컬렉터가 지워준다.

		ob2 = "Japan";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // false

		ob2 = "China";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // false

		ob2 = "Seoul";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // true

		System.out.println(ob2);
		System.out.println(ob2.toString()); // Object의 toString을 오버라이딩함

	}

}
