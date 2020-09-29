package ch09;

public class P419_ButtonExample {

	public static void main(String[] args) {

		P417_Button btn = new P417_Button();
		
		btn.setOnClickListener(new P418_CallListener());
		btn.touch();
		
		btn.setOnClickListener(new P418_MessageListener());
		btn.touch();
	}

}
