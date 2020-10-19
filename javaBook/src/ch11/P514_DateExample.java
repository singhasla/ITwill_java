package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P514_DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		String source = "2020년 12월 25일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date date2 = sdf2.parse(source);
			sdf2.applyPattern("yyyy년 MM월 dd일(E)");
			System.out.println(sdf2.format(date2));	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
