package ch07;

public class P342_KHTire extends P340_Tire{

	//�ʵ�
	
	//������
	public P342_KHTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		
		++accumulatedRotation;		//���� ȸ���� 1 ����
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}

	}
}
