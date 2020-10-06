package ch11;

public class P473_MemberExample {

	public static void main(String[] args) {

		P473_Member obj1 = new P473_Member("blue");
		P473_Member obj2 = new P473_Member("blue");
		P473_Member obj3 = new P473_Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
