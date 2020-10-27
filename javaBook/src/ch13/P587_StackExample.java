package ch13;

import java.util.*;

public class P587_StackExample {

	public static void main(String[] args) {

		Stack<P586_Coin> coinBox = new Stack<P586_Coin>();
		
		coinBox.push(new P586_Coin(100));
		coinBox.push(new P586_Coin(50));
		coinBox.push(new P586_Coin(500));
		coinBox.push(new P586_Coin(10));
		
		while(!coinBox.isEmpty()) {
			P586_Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}

}
