package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P514_DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		String source = "2020�� 12�� 25��";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		try {
			Date date2 = sdf2.parse(source);
			sdf2.applyPattern("yyyy�� MM�� dd��(E)");
			System.out.println(sdf2.format(date2));	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
