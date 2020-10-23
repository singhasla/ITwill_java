package ch13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P582_Q8_HashSetExample {

	public static void main(String[] args) {

		Set<P582_Q8_Student> set = new HashSet<P582_Q8_Student>();
		
		set.add(new P582_Q8_Student(1, "ȫ�浿"));
		set.add(new P582_Q8_Student(2, "�ſ��"));
		set.add(new P582_Q8_Student(1, "���ο�"));
		
		Iterator<P582_Q8_Student> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			P582_Q8_Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}

}
