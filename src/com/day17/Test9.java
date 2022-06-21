package com.day17;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

// 정해진 시간마다 특정 작업을 수행

public class Test9 extends Thread {

	private int num = 0;

	public Test9() {

		TimerTask task = new TimerTask() {

			@Override
			public void run() { // 반복 실행할 작업
				num = 0;
			}
		};

		Timer t = new Timer();

		Calendar now = Calendar.getInstance();

//		// 내일 0시 0분 0초부터 하루에 한번씩 반복s
//		now.add(Calendar.DATE, 1);
//		now.set(Calendar.HOUR, 0);// 오후 1시 : 13시
//		now.set(Calendar.MINUTE, 0);
//		now.set(Calendar.SECOND, 0);
//		now.set(Calendar.MILLISECOND, 0);
//		t.schedule(task, now.getTime(), 1000 * 60 * 60 * 24);

//		t.schedule(task, now.getTime(), 1000*60*60*24); // 밀리세컨,초,분,시 (24시간마다)
		t.schedule(task, now.getTime(), 5000);

	}

	@Override
	public void run() {

		while (true) {

			System.out.println(num++);

			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

	public static void main(String[] args) {

//		Test9 ob = new Test9();
//		ob.start();

		new Test9().start(); // 객체생성해서 매소드 하나를 실행하고 객체를 다시 부를일이 없을때 객체를 부를수있는 참조변수를 저장해 놓지 않는다.

	}

}
