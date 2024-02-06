package com.ruby.java.ch02;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Num:");
		int num=sc.nextInt();
		
		int sum1=0;//홀수 합
		int sum2=0;//짝수 합
		for (int i=0;i<=10;i++) {
			
			if(i%2==0) {		//짝수
				sum2+=i;
				System.out.println("e->"+sum2);
			}
			else {				//홀수
				sum1 +=i;
				System.out.println("o->"+sum1);
			}
		}
		System.out.println("OK:"+sum1+","+sum2);	
	}

}
