package com.ruby.java.ch02;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int j = sc.nextInt();
		
		int sum=0;
		for(int i = 0; i<j; i++) {
			sum +=i;
			System.out.println("->"+sum);
		}
		System.out.println("OK"+sum);
	}

}
