package ch07;

public class P364_AnimalExample {

	public static void main(String[] args) {

		P364_Dog dog = new P364_Dog();
		P364_Cat cat = new P364_Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		
		//������ �ڵ� Ÿ�� ��ȯ
		P363_Animal animal = null;
		animal = new P364_Dog();
		animal.sound();
		animal = new P364_Cat();
		animal.sound();
		System.out.println("-----");
		
		
		//�޼ҵ��� ������
		animalSound(new P364_Dog());
		animalSound(new P364_Cat());
		
	}	
		
		public static void animalSound(P363_Animal animal) {
			animal.sound();
		}
	

}
