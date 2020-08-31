package ch02;

public class P55_VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;

		}
		
		int v3 = v1 + v2 + 5; 	// 특정 블록 내부에서 선언한
								// v2변수를 사용할 수 없음

	}

}
