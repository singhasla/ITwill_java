package ch07;

public class P313_DmbCellPhoneExample {

	public static void main(String[] args) {

		
		//DmbCellPhone ��ü ����
		P312_DmbCellPhone dmbCellPhone = new P312_DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUP();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
