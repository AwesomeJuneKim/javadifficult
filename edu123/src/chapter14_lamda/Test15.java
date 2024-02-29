package chapter14_lamda;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test15 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number= scn.nextInt();
		
		Predicate<Integer> func=(n)-> n%2==0;
		if(func.test(number))
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
	}

}
