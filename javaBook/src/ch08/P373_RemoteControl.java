package ch08;

public interface P373_RemoteControl {

	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
