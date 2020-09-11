package ch06;

public class Car_OL {

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed = 350;
	
	
	//생성자
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
