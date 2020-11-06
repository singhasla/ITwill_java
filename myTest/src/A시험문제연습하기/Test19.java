package A시험문제연습하기;

public class Test19 {

	public static void main(String[] args) {

		A a = new A();
		a.method1(a.num);
		System.out.println(a.num);
		a.method2(a);
		System.out.println(a.val);

	}

}

class A {
	int val = 10;
	int num = 10;
	
	int method1(int num) {
		this.num += 10;
		return this.num;
	}

	void method2(A a) {
		a.val += 10;
	}
}
