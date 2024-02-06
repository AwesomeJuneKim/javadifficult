package com.ruby.java.ch02;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a =23;
		int b=a;
		//a=(byte)b;
		byte i=10;
		byte j =20;
		//byte k = i+j; 연산자+는 정수에 대한 연산자이기 때문에 바이트를 계산할 수 없다.
		byte k = (byte)(i+j);
		System.out.println(i+j);
		System.out.println(k);
	}

}
