package ch13;

import java.util.LinkedList;
import java.util.Queue;

public class P588_QueueExample {

	public static void main(String[] args) {

		Queue<P588_Message> messageQueue = new LinkedList<P588_Message>();
		
		messageQueue.offer(new P588_Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new P588_Message("sendSMS", "�ſ��"));
		messageQueue.offer(new P588_Message("sendKakaotalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			
			P588_Message message = messageQueue.poll();			
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;

			}
			
		}
	}

}
