package chapter14_lamda;

import java.util.Scanner;
import java.util.function.Predicate;
// 짝수홀수 판단하기 
public class Test15 {
	public static void main(String[] args) {
		//숫자를 입력받음 
		Scanner scn=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		//입력받은 숫자를 변수에 저장 
		int number= scn.nextInt();
		
		//참거짓을 판단하는 함수인터페이스로 짝,홀수 판단
		//인터페이스에 메서드 한개임 
		Predicate<Integer> func=(n)-> n%2==0;
		if(func.test(number))
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
	}

}
