package ch11;

public class P473_Member {

	public String id;
	
	public P473_Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof P473_Member) {
			P473_Member member = (P473_Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
}


