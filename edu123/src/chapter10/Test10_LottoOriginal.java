package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10_LottoOriginal {
public static void main(String[] args) {
	lotto_generator(5);
}
public static void lotto_generator(int n) {
	Random number = new Random();
	HashSet<Integer> lotto = null;
	for (int i = 0; i < n; i++) {
		lotto = new HashSet<Integer>();
		for (int j = 0; lotto.size() <= 6; j++) {
			lotto.add(1+number.nextInt(45));
//			System.out.println("lotto_size = " + lotto.size());
		}
		List<Integer> L = new ArrayList<Integer>(lotto);
//		Collections.sort(L);; 1+ 위에서 발생한 리스트를 정렬해준다.
		System.out.println(L);
	}
}
}
