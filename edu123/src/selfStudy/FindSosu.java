package selfStudy;

import java.util.Scanner;

public class FindSosu {
//	public static void main(String[] args) {
//		Scanner scn= new Scanner(System.in);
//		System.out.print("자릿수를 입력하세요 : ");
//		int num= scn.nextInt();
//		
//		long s= (long)Math.pow(10.0, (double)(num-1));//하한
////		String srtS=Long.toString(s);
//		long e=(long)Math.pow(10.0, (double)(num))-1;//상한
////		String srtE=Long.toString(e);
//		primeRange(s,e);
//	}
//		public static boolean isPrimeDigits(long number) {
//		String numStr=String.valueOf(number);
//		for(int i=0;i<=numStr.length();i++) {
//			char digit=numStr.charAt(i)
//			
//			
////			if(isPrime((int) i)&& isPrime((int) (i/1000))&& isPrime((int) (i/100))&& isPrime((int) (i/10)))
//			
////			int number=(int)(i*0.001);
////				if(isPrime(number)) {
//					System.out.println(i);
//				
//			}
//		}
//
//	private static void primeRange(long s, long e) {
//		// TODO Auto-generated method stub
//		
//	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
	public static void main(String[] args) {
		try(Scanner scn= new Scanner(System.in)) {
			System.out.print("자릿수를 입력하세요 : ");
			int num= scn.nextInt();
			
			long s= (long)Math.pow(10.0, (double)(num-1));//하한
			long e=(long)Math.pow(10.0, (double)(num))-1;//상한
			
//			System.out.println(s + "," + e);
			for (long i = s ; i <= e ; i++) {
				//i를 문자열로 변환
				String str = String.valueOf(i);
				Boolean flag = false;
				
				// 733
				for (int j = 1 ; j <= str.length() ; j++) {
					String tstr = str.substring(0, j);
//					System.out.println("tstr" + j + ":" + tstr);
					int val = Integer.valueOf(tstr);
					
					if (isPrime(val) == false) {
						flag = true;
						break;					
					}
				}
				if (flag == false) {
					System.out.println(i);
				}
			}
		}
	}

}
