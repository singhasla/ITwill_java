package ch09;

public class P436_Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2){
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;

		/* 매개변수도 지역변수임 */
		//arg1 = 20;	(x)
		//arg2 = 20;	(x)
		
		//var1 = 30;	(x) /* 상수는 변경불가 */
		//var2 = 30;	(x) /* 25번째줄에서 arg2를 사용하고 있기 때문에.. 컴파일 오류 */
		
		P435_Calculatable calc = new P435_Calculatable() {
			
			@Override
			public int sum() {
	
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
