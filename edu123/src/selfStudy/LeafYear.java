package selfStudy;

import java.util.Scanner;

public class LeafYear {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int n = scn.nextInt();
		if (n % 4 == 0) {
			if (n % 100 != 0) {
				System.out.println("윤년");
			} else if(n%400==0) {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}

	}
}
