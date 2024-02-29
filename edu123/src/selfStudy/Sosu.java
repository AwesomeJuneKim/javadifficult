package selfStudy;

import java.util.Scanner;

public class Sosu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("자릿수를 입력하세요 : ");
		int num = scn.nextInt();

		long s = (long) Math.pow(10.0, (double) (num - 1));// 하한
		long e = (long) Math.pow(10.0, (double) (num)) - 1;// 상한

		// boolean flag= false;
		for (long i = s; i <= e; i++) {
			for (long j = 2; j <= i; j++) {
				if (i % j == 0) {//나머지가 0이되는 j를 구했다면
					if (i != j)//i와 j가 같지 않으면 처음으로 다시 돌아감
						// flag=true;
						break;
					System.out.println(i);//i와 j가 같을때 i를 출력함
				}
			}
		}

	}

}
