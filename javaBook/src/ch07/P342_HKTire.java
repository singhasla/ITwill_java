package ch07;

public class P342_HKTire extends P340_Tire{

	//�ʵ�
	
	//������
	public P342_HKTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		
		++accumulatedRotation;		//���� ȸ���� 1 ����
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
