package ch06_diff;

public class Exam_Getter_Setter {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=0)
			this.balance = balance;
		else
			System.out.println("정상적인 값이 아닙니다.");
	}
	
}
