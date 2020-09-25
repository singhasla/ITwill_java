package ch08;

public class P374_Television implements P373_RemoteControl{

	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume > P373_RemoteControl.MAX_VOLUME) {
			this.volume = P373_RemoteControl.MAX_VOLUME;
		} else if(volume < P373_RemoteControl.MIN_VOLUME) {
			this.volume = P373_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ���� : " + this.volume);
	}
}
