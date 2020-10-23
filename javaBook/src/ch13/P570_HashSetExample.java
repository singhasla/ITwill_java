package ch13;

import java.util.HashSet;
import java.util.Set;

public class P570_HashSetExample {

	public static void main(String[] args) {

		Set<P569_Member> set = new HashSet<P569_Member>();
		
		set.add(new P569_Member("È«±æµ¿",30));
		set.add(new P569_Member("È«±æµ¿",30));
		
		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
	}

}
