package ch11;

public class P494_StringReplaceExam {

	public static void main(String[] args) {

		String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
