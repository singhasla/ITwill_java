package ch10;

class Acount {
	
	int bal = 0;
	
	Acount(int bal) {
		if(bal >= 0) {
			this.bal = bal;
			System.out.println("�ܾ�: "+ bal);
		} else throw new RuntimeException("�ܾ� ������ �߸� �Ǿ����ϴ�."); 
	/*
		} else {
			System.out.println("�ܾ� ������ �߸� �Ǿ����ϴ�.");
		}
	*/
	}

	void withdraw(int i) {
		if(i <= bal) {
			bal -= i;
			System.out.println("�ܾ�: "+ bal);
		} else {
			System.out.println("����� �� �����ϴ�.");
		}
	}
	
	void deposit(int i) {
		if(i > 0) {
			bal += i;
			System.out.println("�ܾ�: "+ bal);
		} else {
			System.out.println("�Ա��� �� �����ϴ�.");
		}
		
	}

}

public class ExceptionTest {

	public static void main(String[] args) {
		
		Acount acount1 = new Acount(100);
		acount1.withdraw(1000);
		acount1.deposit(1000);
		
		Acount acount2 = new Acount(-1000);

	}

}
