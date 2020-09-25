package ch08;

public class P385_Q3_SoundableExample {

	private static void printSound(P385_Q3_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
	}

}
