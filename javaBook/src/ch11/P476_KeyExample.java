package ch11;

import java.util.HashMap;

public class P476_KeyExample {

	public static void main(String[] args) {

		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<P476_Key, String> hashMap = new HashMap<P476_Key, String>();
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new P476_Key(1), "ȫ�浿");
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		String value = hashMap.get(new P476_Key(1));
		System.out.println(value);
	}
}
