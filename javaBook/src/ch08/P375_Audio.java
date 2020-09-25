package ch08;

public class P375_Audio implements P373_RemoteControl{

	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume > P373_RemoteControl.MAX_VOLUME) {
			this.volume = P373_RemoteControl.MAX_VOLUME;
		} else if(volume < P373_RemoteControl.MIN_VOLUME) {
			this.volume = P373_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
