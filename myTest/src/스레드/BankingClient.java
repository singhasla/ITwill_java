package ������;

public class BankingClient {

	public static void main(String[] args) {

		Account account = new Account(5000);
		WithdrawThread iBanking = new WithdrawThread("���ͳݹ�ŷ", account, 1000);
		WithdrawThread mBanking = new WithdrawThread("����Ϲ�ŷ", account, 1000);
		
		iBanking.start();
		mBanking.start();
	}

}
