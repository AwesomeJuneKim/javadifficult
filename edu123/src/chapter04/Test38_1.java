package chapter04;

import java.util.Random;

public class Test38_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= new int[5][5];
		Random rand= new Random();
		for(int i=0;i<arr.length;i++)
			for(int j=0; j<arr[0].length; j++)
				arr[i][j]=rand.nextInt(500);
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(i>j)
					System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
//		arr[0][0]=1;
//		arr[0][1]=2;
//		System.out.println("행의 수"+arr.length);//행의 길이 확인
//		
//		System.out.println("열의 수"+arr[0].length);//열의 길이 확인
//		
//		int arr2[][]= {{1,2},{3,4},{5,6}};//ragged array 많이 쓰이지 않음
	}

}
