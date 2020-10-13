package ch11;

public class P476_Key {

	public int number;
	
	public P476_Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof P476_Key) {
			P476_Key compareKey = (P476_Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
}
