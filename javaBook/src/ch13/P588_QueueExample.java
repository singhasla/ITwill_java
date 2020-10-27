package ch13;

import java.util.LinkedList;
import java.util.Queue;

public class P588_QueueExample {

	public static void main(String[] args) {

		Queue<P588_Message> messageQueue = new LinkedList<P588_Message>();
		
		messageQueue.offer(new P588_Message("sendMail", "È«±æµ¿"));
		messageQueue.offer(new P588_Message("sendSMS", "½Å¿ë±Ç"));
		messageQueue.offer(new P588_Message("sendKakaotalk", "È«µÎ²²"));
		
		while(!messageQueue.isEmpty()) {
			
			P588_Message message = messageQueue.poll();			
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(message.to + "´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
				break;

			}
			
		}
	}

}
