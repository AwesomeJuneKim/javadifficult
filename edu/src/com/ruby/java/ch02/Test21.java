package com.ruby.java.ch02;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//모르겠다
		System.out.println("a=");
		int a = sc.nextInt();
		System.out.println("b=");
		int b= sc.nextInt();
		System.out.println("op=");
		int op= sc.nextInt();
		
		
		if(op=='+') {
			System.out.println(a+b);
		} else if(op=='-') {
			System.out.println(a-b);
		} else if(op=='*') {
			System.out.println(a*b);
		} else if(op=='/') {
			System.out.println(a/b);
		}
	}

}
