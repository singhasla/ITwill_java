package SET;

import java.util.*;

class TreeSetLotto {
	Integer bonus;
	Set<Integer> lotto = new TreeSet<>();
	
	public void setup() {
		Random random = new Random();
		while(bonus == null) {
			int num = random.nextInt(45) + 1;
			if(!lotto.contains(num)) {
				if(lotto.size()<6) {
					lotto.add(num);
				} else {
					bonus = num;
				}
			}
		}
	}
	

	@Override
	public String toString() {
		return "당첨번호: " + lotto + ", 보너스: " + bonus;
	}
}

public class TreeSetLottoTest {

	public static void main(String[] args) {

		TreeSetLotto lotto = new TreeSetLotto();
		lotto.setup();
		System.out.println(lotto);
	}
}
