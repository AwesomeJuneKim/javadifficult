package chapter14_lamda;

import java.util.Scanner;
import java.util.function.Predicate;

// 짝수홀수 판단하기 
public class Test15_P {
	public static void main(String[] args) {
		//숫자를 입력받음 
		Scanner scn= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num= scn.nextInt();
		
		Predicate<Integer> prd=(n)->n%2==0;
		if(prd.test(num)) {
			System.out.println("짝수입니다.");
		}else System.out.println("홀수입니다.");
		
		
		

		//입력받은 숫자를 변수에 저장 

		
		//참거짓을 판단하는 함수인터페이스로 짝,홀수 판단
		//인터페이스에 메서드 한개임 


	}

}
