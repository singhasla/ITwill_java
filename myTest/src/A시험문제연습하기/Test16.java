package A���蹮�������ϱ�;

public class Test16 {

	public static void main(String[] args) {

		Add add = new Add(20, 80);
		
		System.out.println(add.getValue());
	}

}

class Add {
	// ��� ����
	int a;
	int b;

	// ������
	Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// �޼ҵ�
	int getValue() {
		return a + b;
	}
}