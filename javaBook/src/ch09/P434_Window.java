package ch09;

public class P434_Window {

	P433_Button button1 = new P433_Button();
	P433_Button button2 = new P433_Button();
	
	//필드 초기값으로 대입
	P433_Button.OnClickListener listener = new P433_Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	P434_Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new P433_Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
