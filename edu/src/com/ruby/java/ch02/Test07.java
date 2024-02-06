package com.ruby.java.ch02;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		int b=10;
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		int c=10;
		int d=10;
		System.out.println(++c);
		System.out.println(d++);
		
		boolean result=(b==c);
		System.out.println("result="+result);
		
		boolean isOn = true;
		isOn=!isOn;
		System.out.println(isOn);
	}

}
