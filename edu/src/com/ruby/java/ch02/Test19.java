package com.ruby.java.ch02;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int score= sc.nextInt();
		
		String result="";
		if(score>=60) {
			result="합격";
		} else {
			result="불합격";
		}
		System.out.println("당신의 점수는 "+score+"점이므로 "+result+"입니다.");
		
		sc.close();
	}

}
