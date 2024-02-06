package com.ruby.java.ch02;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12;
		int b= -12;
		String bBit = Integer.toBinaryString(b);//이진수로 변환하는 메소드
		System.out.println("bBit= "+bBit);
		
		String aBit= Integer.toBinaryString(a);
		System.out.println("aBit= "+aBit);
		int c = 0x27;//16진수
		System.out.println("c= "+c);

	}

}
