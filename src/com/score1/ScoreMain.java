package com.score1;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new Score();

		ob.set();
		ob.input();
		ob.print();
		System.out.println(ob);
		System.out.println(ob.rec);
		System.out.println(ob.rec[0]);
		System.out.println(ob.rec[1]);
	}

}
