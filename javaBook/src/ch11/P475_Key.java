package ch11;

public class P475_Key {

	public int number;
	
	public P475_Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof P475_Key) {
			P475_Key compareKey = (P475_Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}
}
