package ch07;

public class P340_Tire {

	//필드
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어의 위치
	
	//생성자
	public P340_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		
		++accumulatedRotation;		//누적 회전수 1 증가
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
