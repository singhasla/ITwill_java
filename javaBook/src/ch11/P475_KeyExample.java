package ch11;

import java.util.HashMap;

public class P475_KeyExample {

	public static void main(String[] args) {

		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<P475_Key, String> hashMap = new HashMap<P475_Key, String>();
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new P475_Key(1), "ȫ�浿");
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		String value = hashMap.get(new P475_Key(1));
		System.out.println(value);
	}

}
