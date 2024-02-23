package selfStudy;

public class Gugudan {

	public void print(int num) {
		System.out.println(num+"단");
		//i단 출력시작
		
		for(int i=1; i<=9; i++) {
			int j=num;
//			while(num<=9) {

				System.out.print(j+"x"+i+"="+j*i);
				System.out.println();
				j++;
//		}
		}
		
		
		
		
		//i단 출력 끝
		
	}
	
}
