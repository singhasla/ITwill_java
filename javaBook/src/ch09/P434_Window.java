package ch09;

public class P434_Window {

	P433_Button button1 = new P433_Button();
	P433_Button button2 = new P433_Button();
	
	//�ʵ� �ʱⰪ���� ����
	P433_Button.OnClickListener listener = new P433_Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	P434_Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new P433_Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
