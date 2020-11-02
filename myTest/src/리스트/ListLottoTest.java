package 리스트;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListLottoTest {

	public static void main(String[] args) {
		ListLotto lotto = new ListLotto();
		lotto.setup();
		System.out.println(lotto);
	}
}

class ListLotto{
	Integer bonus;
	List<Integer> lotto = new ArrayList<>();
	
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
		Collections.sort(lotto);
	}

	@Override
	public String toString() {
		return "당첨번호: " + lotto + ", 보너스: " + bonus;
	}
}
	