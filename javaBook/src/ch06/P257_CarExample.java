package ch06;

public class P257_CarExample {

	public static void main(String[] args) {
	
		Car4 myCar = new Car4();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else{
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
