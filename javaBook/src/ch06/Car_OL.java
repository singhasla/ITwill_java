package ch06;

public class Car_OL {

	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed = 350;
	
	
	//������
	public Car_OL() {
	}
	
	Car_OL(String model){
		this.model = model;
	}
	
	Car_OL(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car_OL(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
