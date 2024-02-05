package com.ruby.java.ch02;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depositAmount;
		depositAmount = 50000;
		float ratio= 0.14f;
		boolean result = true;
		result =  false;
		System.out.println(result);
		char gender='F';
		
		System.out.println(depositAmount*ratio);
		
		char c = '\u0057';//유니코드 0057을 출력
		System.out.println("code = "+ c +"\ngender = "+gender);
		
		String greeting = "Good Morning";
		System.out.println(greeting);
	}

}
