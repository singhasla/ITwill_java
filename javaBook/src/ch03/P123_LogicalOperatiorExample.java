package ch03;

public class P123_LogicalOperatiorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode>=97) & (charCode<=122)) {
			System.out.println("소문자군요");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자군요");
		}
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}

		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	
		//////////////////////////////////////////////
		
		int a = 10;
		int b = 20;
		System.out.println( (a+=10)>15 | (b-=10)>15 );	//왼쪽항이 true이라도 오른쪽항 연산함
		System.out.println("a = " + a + ", b = " + b);	//b까지 계산
		
		a = 10;
		b = 20;
		System.out.println( (a+=10)>15 || (b-=10)>15 );	//왼쪽항이 true이므로 바로 true 출력
		System.out.println("a = " + a + ", b = " + b);	//b는 계산안함
	}

}
