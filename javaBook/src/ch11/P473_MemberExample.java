package ch11;

public class P473_MemberExample {

	public static void main(String[] args) {

		P473_Member obj1 = new P473_Member("blue");
		P473_Member obj2 = new P473_Member("blue");
		P473_Member obj3 = new P473_Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
