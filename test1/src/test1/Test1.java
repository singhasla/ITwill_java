package test1;

public class Test1 {

	public static void main(String[] args) { //메인 메서드
		
		System.out.println("이승하");
		////////////////////////////////////////////////////////////////////
		
		int count = 100; //변수선언과 동시에 값 대입, --> '초기값'이라고 함
		count = (int)200.0;
		System.out.println(count);
		
		short data1 = 20;
		count = data1;			//자동 형변환
		
		long longData = count;	//자동 형변환
		
		System.out.println(count);
		System.out.println(longData);
		
		///////////////////////////////////////////////////////////////////
		
		double area;
		area = 0.0;
		area = 100;				//자동 형변환(int(기본) => double)
		
		float area2;
		area2 = (float)0.0;		//명시적 형변환(double(기본) => float)
		
		char grade;
		grade = 'A';
		grade = (char)count;	//명시적 형변환(int => char)
		
		
		int text = 'B';
		System.out.println(text);	// A => 65, B => 66
		
		boolean isEqual;
		isEqual = true;
		
		///////////////////////////////////////////////////
		
		int data2 = 100;
		int data3 = 200;
		int data4 = 50;
		
		int max = (data2>data3)?data2:data3;
		max = (max>data4)?max:data4;
		
		int min = (data2<data3)?data2:data3;
		min = (min<data4)?min:data4;
		
		System.out.println(max);
		System.out.println(min);
		

	}

}