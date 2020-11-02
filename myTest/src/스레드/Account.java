package ������;

public class Account {
	protected int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public synchronized int withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		if(balance >= money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(threadName + " ���: �ܾ�: " + balance);
		} else {
			System.out.println(threadName + ": �ܾ� ���� ��� �Ұ�");
		}
		return balance;
	}
	
	public int deposit(int money) {
		return balance += money;
	}
}
