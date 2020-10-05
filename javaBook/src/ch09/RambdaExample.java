package ch09;


@FunctionalInterface
interface I {
	void methodI(String s);
}

public class RambdaExample {

	public static void main(String[] args){
		I i = new I(){
			@Override
			public void methodI(String s){
				System.out.println(s);
			}
		};
		
		I i1 = (s) -> System.out.println(s);
		
		I i2 = System.out::print;
	}
}

