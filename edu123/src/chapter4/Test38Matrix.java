package chapter4;

import java.util.Random;

public class Test38Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int A[][]= new int[3][4];//난수 입력
//		int B[][]= new int[4][5];//난수 입력
//		int C[][]= new int[3][5];
//		int D[][]= new int[3][4];//난수 입력
//		int E[][]= new int[3][4];
//		int F[][]= new int[4][3];
		//C=A*B
		//E=A+D
		//F=A 전치 행렬
		
		//각각 난수 입력
		int [][] A = new int[3][4];
		Random rand= new Random();
		for(int i=0;i<A.length;i++) {
			for(int j=0; j<A[0].length; j++) {
				A[i][j]=rand.nextInt(501);{
		System.out.print(A[i][j]+" ");
				}
			}
		}
		System.out.println();
		
		int [][] B = new int[4][5];
		Random randTwo= new Random();
		for(int i=0;i<B.length;i++) {
			for(int j=0; j<B[0].length; j++) {
				B[i][j]=randTwo.nextInt(501);{
		System.out.print(B[i][j]+" ");
				}
			}
		}
	
		
		
		
		
		
		}
	}