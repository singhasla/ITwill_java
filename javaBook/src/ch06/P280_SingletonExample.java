package ch06;

public class P280_SingletonExample {

	public static void main(String[] args) {

		/*
			P280_Singleton obj1 = new P280_Singleton(); 
			P280_Singleton obj2 = new P280_Singleton();
		 */
		
		P280_Singleton obj1 = P280_Singleton.getInstance();
		P280_Singleton obj2 = P280_Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}

}
