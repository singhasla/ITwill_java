package ch10;

class Acount {
	
	int bal = 0;
	
	Acount(int bal) {
		if(bal >= 0) {
			this.bal = bal;
			System.out.println("잔액: "+ bal);
		} else throw new RuntimeException("잔액 설정이 잘못 되었습니다."); 
	/*
		} else {
			System.out.println("잔액 설정이 잘못 되었습니다.");
		}
	*/
	}

	void withdraw(int i) {
		if(i <= bal) {
			bal -= i;
			System.out.println("잔액: "+ bal);
		} else {
			System.out.println("출금할 수 없습니다.");
		}
	}
	
	void deposit(int i) {
		if(i > 0) {
			bal += i;
			System.out.println("잔액: "+ bal);
		} else {
			System.out.println("입금할 수 없습니다.");
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
