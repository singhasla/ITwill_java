package ch09;

public class P428_AnonymousExample {

	public static void main(String[] args) {

		P428_Anonymous anony = new P428_Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		
		//익명 객체 매개값 사용
		anony.method2(

				new P427_Person(){
					void study(){
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake(){
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
		);
		
	}

}