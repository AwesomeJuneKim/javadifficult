package homework;

//구현과제로 실습
//hashset을 arraylist로 변환하여 정렬하기 구현

/*
* 로또 당첨 규칙:
* 꽝: 번호 2개, 1개
* 5등: 번호 3개 - 5000원
* 4등: 번호 4개 - 5만원
* 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
* 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
* 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
*/
//hashset을 arraylist로 변환하여 정렬하기 구현
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test_ch10_lottoEditted {

	public static void main(String[] args) {

		lotto_generator(10);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		List<HashSet<Integer>> lotSet = new ArrayList<>();
		HashSet<Integer> lotto = null;// 복권 1장
		
		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();
			// 구현할 부분
			for (int j = 0; lotto.size() < 6; j++) {
				lotto.add(1 + number.nextInt(45));
			}
			lotSet.add(lotto);// 복권 명부에 발행 복권을 추가

		}
		System.out.println("\nlot hashset을 출력\n");
		
		for (HashSet<Integer> eachLotto : lotSet) {
			System.out.println(eachLotto);
			
		}
		
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 6; j++) {// 6개 번호와 보너스 번호
			win.add(1 + number.nextInt(45));
		}
		int bonus;
		do {
			bonus = 1 + number.nextInt(45);
		} while (win.contains(bonus));
		System.out.print("당첨번호: " + win + "보너스번호=" + bonus);// 6개의 당첨번호와 보너스번호
		// 6개를 맞힌 복권을 찾는다
		System.out.println();
		winnerLotto(win, bonus, lotSet);// 1등을 찾는다

	}

	static void winnerLotto(HashSet<Integer> w, int bns, List<HashSet<Integer>> lottoSet) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 al의 모든 원소 elem에 대하여 조사한다
		for (int i = 0; i < lottoSet.size(); i++) {
			// 구현할 부분
			checkWinner(w, bns, lottoSet.get(i));
		}
	}

	static void checkWinner(HashSet<Integer> w, int bns, HashSet<Integer> elem) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		// List<Integer> L = new ArrayList<>(w);
		int count = 0;
		for (int num : elem) {
			if (w.contains(num)) {
				count++;
				/*
				 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
				 */
				// 구현할 부분
			}
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 4:
			System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 5:
			if (elem.contains(bns)) { // 보너스 번호가 일치하는 지를 조사
				System.out.println("2등 복권 " + elem + " 당첨번호:" + w);

			} else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
			}
			break;

		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
			break;

		}
	}
}
