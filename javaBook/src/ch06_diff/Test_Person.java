package ch06_diff;

import ch06.Person;

public class Test_Person {

	void change1(int age) {
		age = age + 10;
	}

	void change2(Person person) {
		person.age = person.age + 10;
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();

		
		Test_Person tp = new Test_Person();
		tp.change1(p1.age);
			System.out.println(p1.age);
		tp.change2(p1);
			System.out.println("∏ﬁ¿Œ change2:"+p1.age);

	}
}