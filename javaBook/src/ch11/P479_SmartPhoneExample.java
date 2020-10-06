package ch11;

public class P479_SmartPhoneExample {

	public static void main(String[] args) {

		P478_SmartPhone myPhone = new P478_SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
