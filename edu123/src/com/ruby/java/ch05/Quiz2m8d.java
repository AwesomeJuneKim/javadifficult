package com.ruby.java.ch05;

import java.util.Scanner;

public class Quiz2m8d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스캐너 입력
		//(2그람 추의 수, 3그람 추의 수, 5그람 추의 수)
		//추 무게의 합을 모두 구하라
		int num;
		do {
		Scanner sc= new Scanner(System.in);
		System.out.println("10~100사이의 숫자를 입력하세요:");
		int num= sc.nextInt();
		} while(num !=0 &&(num<10||100<num));
		
			if(num==0)break;
		
		for(int i=1;i<=10; i++) {
			for(int j=1; j<=10;j++) {
				for(int z=1; z<=10;z++) {
					
					int sum= i*2+j*3+z*5;
					if(sum==num)
					System.out.println("("+i+","+j+","+z+")");
				}
			}
		}
		
		}
	}
	
	
}
