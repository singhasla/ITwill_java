package ch12;

public class P550_AutoSaveThread extends Thread{
	public void save() {
		System.out.println("�۾� ���� ����");
	}

	@Override
	public void run() {

		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
		
	}

}
