package ch07;

public class P312_DmbCellPhone extends P311_CellPhone{

	//�ʵ�
	int channel;
	
	//������
	public P312_DmbCellPhone(String model, String color, int channel) {
	
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��ۼ����� ����ϴ�.");
	}
}
