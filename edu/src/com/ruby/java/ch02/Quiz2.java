package com.ruby.java.ch02;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num= sc.nextInt();
		boolean flag = false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		System.out.println(flag?"소수가 아닙니다.":"소수입니다.");
	}

}
