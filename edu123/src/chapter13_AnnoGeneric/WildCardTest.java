package chapter13_AnnoGeneric;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };

		List<Integer> iList = Arrays.asList(inum);
							//Arrays는 스태틱메서드이기 때문에 호출없이 바로 사용가능
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);

		double isum = sum(iList);
		double dsum = sum(dList);
		//double ssum = sum(sList);
		//sum(sList)는 합이 불가하다->섬에는 넘버의 자손클래스만 들어갈 수 있으므로

		System.out.println("inum의 합계: " + isum);
		System.out.println("dnum의 합계: " + dsum);
	}

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
}
