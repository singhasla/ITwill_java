package ch07;

public  abstract class P360_Phone {

	//�ʵ�
	public String owner;
	
	//������
	public P360_Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
