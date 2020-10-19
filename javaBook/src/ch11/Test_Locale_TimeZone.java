package ch11;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Test_Locale_TimeZone {

	public static void main(String[] args) {

		System.out.println("로케일");
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale l : locales) 
			System.out.println(l.getLanguage() + " - " + l.getCountry() );
		
		System.out.println("");
		
		System.out.println("타임존");
		String[] tzs = TimeZone.getAvailableIDs();
		for(String tz:tzs)
			System.out.println("타임존 : " + tz);
		
		System.out.println("");
		
		Calendar cal = Calendar.getInstance();
		TimeZone newYorkTZ = TimeZone.getTimeZone("Americal/New_York");
		Calendar nyCal = Calendar.getInstance(newYorkTZ);
		int gap = (cal.get(Calendar.HOUR_OF_DAY) - nyCal.get(Calendar.HOUR_OF_DAY));
		
		Calendar buddhistCal = Calendar.getInstance(new Locale("th","TH"));
		System.out.println(buddhistCal.getClass().getName());
	}

}
