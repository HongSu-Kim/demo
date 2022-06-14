package com.day12;

import java.util.Calendar;
//import java.util.GregorianCalendar;

// Calendar

public class Teat1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
//		Calendar now1 = new GregorianCalendar(); // UPCAST

		int y = now.get(Calendar.YEAR); // 년
		int m = now.get(Calendar.MARCH) + 1; // 월(0~11)
		int d = now.get(Calendar.DATE); // 일
		int w = now.get(Calendar.DAY_OF_WEEK); // 주의수(1~7 : 일요일 - 1)

		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(y + "-" + m + "-" + d + week[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);

		System.out.println(startDay + " : " + endDay);

		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);

		System.out.printf("%1$tF %1$tT\n", now);

		now.set(2023, 10 - 1, 10);
		y = now.get(Calendar.YEAR); // 년
		m = now.get(Calendar.MARCH) + 1; // 월(0~11)
		d = now.get(Calendar.DATE); // 일
		w = now.get(Calendar.DAY_OF_WEEK); // 주의수(1~7 : 일요일 - 1)
		System.out.println(y + "-" + m + "-" + d + week[w - 1]);

	}

}
