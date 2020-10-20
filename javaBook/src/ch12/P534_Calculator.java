package ch12;

public class P534_Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ": "+ this.memory);
	}

}
