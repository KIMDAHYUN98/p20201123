package com.ydm;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		showCal(2020, 10);

//		showCal(2020, 4); // 2020년 5월달 달력 출력

//		Calendar cal = Calendar.getInstance();
//
//		cal.set(2020, 5, 2); // 2020년 5월 1일 / 0부터 시작

	}

	public static void showCal(int year, int month) {

		System.out.print("         [" + year + "년 ");
		System.out.println(month + "월" + "]");

		int tMonth = month - 1;
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int lDate = cal.getActualMaximum(Calendar.DATE);
		year = cal.get(Calendar.YEAR);
		tMonth = cal.get(Calendar.MONTH);
		int fdate = cal.get(Calendar.DAY_OF_WEEK);
		// "요일 : " + cal.get(Calendar.DAY_OF_WEEK)

		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		
		for (int j = 0; j < day.length; j++) {
			System.out.printf("%4s", day[j]);
		}
		System.out.println();

		for (int k = 1; k < fdate; k++) {
			System.out.printf("%4s", " ");
		}

		for (int i = 1; i <= lDate; i++) {

			System.out.printf("%4d", i);

			if (fdate % 7 == 0) {
				System.out.println();
			}
			fdate++;

		} // end of for

	}

}
