package ch13;

public class P582_Q8_Student {

	public int studentNum;
	public String name;
	
	public P582_Q8_Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P582_Q8_Student) {
			P582_Q8_Student student = (P582_Q8_Student) obj;
			return (studentNum == student.studentNum);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
}
