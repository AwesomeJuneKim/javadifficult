package com.ruby.java.ch02;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=0b00010001;
		byte b=0b00100010;
		
		int c=a&b;
		System.out.println("c="+ Integer.toBinaryString(c));
		
		int e = a^b;//00110011
		System.out.println("e="+ Integer.toBinaryString(e));
		
		int f = 12;
		int g= (~f)+1;// two's compliment
		System.out.println("g="+g);
		
		int h = f<<1;
		int i = f>>1;//왼쪽으로 1비트 이동
		//00001100 ->12
		//00011000 ->24 두배가 된다.
		System.out.println("h="+h);
		System.out.println("i="+i);
		
	}

}
