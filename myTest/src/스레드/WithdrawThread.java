package ½º·¹µå;

public class WithdrawThread extends Thread{
	Account account;
	int money;
	boolean flag = true;
	
	public WithdrawThread(String name, Account account, int money) {
		super(name);
		this.account = account;
		this.money = money;

	}
	
	public void run() {
		for(int i=0; i<6 || flag; i++) {
			int balance = account.withdraw(money);
			if(balance <= money) {
				flag = false;
			}
		}
	}

}
