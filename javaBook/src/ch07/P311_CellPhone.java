package ch07;

public class P311_CellPhone {

	String model;
	String color;
	
	//������
	
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell(){System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message){System.out.println("�ڱ�: " + message);}
	void receiveVoice(String message){System.out.println("����: " + message);}
	void hangUP(){System.out.println("��ȭ�� �����ϴ�.");}
}

