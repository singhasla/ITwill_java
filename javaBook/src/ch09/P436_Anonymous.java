package ch09;

public class P436_Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2){
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;

		/* �Ű������� ���������� */
		//arg1 = 20;	(x)
		//arg2 = 20;	(x)
		
		//var1 = 30;	(x) /* ����� ����Ұ� */
		//var2 = 30;	(x) /* 25��°�ٿ��� arg2�� ����ϰ� �ֱ� ������.. ������ ���� */
		
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
