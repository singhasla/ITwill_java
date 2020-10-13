package ch11;

public class Test_Circle {

	int r;
	int x;
	int y;
	
	public Test_Circle(int i, int j, int k) {
		this.r = i;
		this.x = j;
		this.y = k;
	}
	
	
@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test_Circle other = (Test_Circle) obj;
		if (r != other.r || x != other.x || y != other.y)
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public String toString() {
		return " ¿ø ¹ÝÁö¸§:" + this.r + ", XÁÂÇ¥:" + this.x + ", YÁÂÇ¥:" + this.y;
	}
	
	
}
