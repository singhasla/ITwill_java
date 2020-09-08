package ch05;

import java.util.Calendar;

public class P208_EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P205_Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = P205_Week.SUNDAY;
			break;
		case 2:
			today = P205_Week.MONDAY;
			break;
		case 3:
			today = P205_Week.TUESDAY;
			break;
		case 4:
			today = P205_Week.WEDNESDAY;
			break;
		case 5:
			today = P205_Week.THURSDAY;
			break;
		case 6:
			today = P205_Week.FRIDAY;
			break;
		case 7:
			today = P205_Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == P205_Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
