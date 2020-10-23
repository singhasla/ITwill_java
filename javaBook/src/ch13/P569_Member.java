package ch13;


public class P569_Member {
	public String name;
	public int age;
	
	public P569_Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P569_Member) {
			P569_Member member = (P569_Member)obj;
			return member.name.equals(name) && (member.age==age);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
}
