package ���Խ�;

public class ���Խ� {

	public static void main(String[] args) {

		String data = "ȫ�浿0�̼���z������";	//������
		
		String[] result = data.split("[0-9a-z]");
		
		for(String str : result)
			System.out.println(str);
		
		System.out.println("//////////////////////");
		//////////////////////////////////////////
		String nameRule = "[a-zA-Z��-�R]{2,10}";
		
		System.out.println("hello java".matches(nameRule));
		System.out.println("ȫ�浿".matches(nameRule));
		System.out.println("ȫ�浿2".matches(nameRule));
		System.out.println("he llo".matches(nameRule));
	}

}
