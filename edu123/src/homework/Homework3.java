package homework;

import java.util.Random;

public class Homework3 {
	/*
	 * 하나의 자바 파일에서 함수 구현 실습
	 */

	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의 1차버젼: 덧셈후 바로 출력 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	static void showMatrix(int[][] X) {
		// 2차원 모습으로 출력
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[i].length; j++) {
				System.out.print(X[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void getData(int[][]B) {
		// static을 안붙이고 싶으면 메인메소드에 클래스의 참조변수를 연결해줘야 한다.
		Random rnd=new Random();
		for(int i=0;i<B.length;i++)
			for(int j=0;j<B[i].length;j++)
			B[i][j]=rnd.nextInt(10);
	}

	static int[][] addMatrix(int[][]B, int[][]C){
		int[][]m=new int[B.length][B[0].length];
				for(int i=0;i<B.length;i++)
					for(int j=0;j<B[i].length;j++)
						m[i][j]=B[i][j]+C[i][j];
				return m;
			}

	static int[][] multiplyMatrix(int[][]B, int[][]E) {
		int[][]D= new int [B.length][E[0].length];
		for(int i=0; i<B.length;i++)
			for(int j=0;j<E[0].length;j++)
				for(int k=0;k<B[0].length;k++)
					D[i][j]+= B[i][k]*E[k][j];
		return D;
					

	}

	static int[][] transposeMatrix(int[][] B) {
		int[][]F= new int[B[0].length][B.length];
		for(int i=0;i<B.length;i++)
			for(int j=0; j<B[0].length;j++)
				F[j][i]=B[i][j];
		return F;

	}

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화 A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5]; F[4][3]
		 * = B[3][4]의 전치 행렬
		 */
		int[][]B= new int[3][4];
		int[][]C=new int[3][4];
		int[][]E= new int[4][5];
		
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		getData(B);
		getData(C);
		getData(E);
		int[][]A = addMatrix(B, C);
		showMatrix(B);
		showMatrix(C);
		showMatrix(A);
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		int[][]D = multiplyMatrix(B, E);
		showMatrix(B);
		showMatrix(E);
		showMatrix(D);
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		int[][]F = transposeMatrix(B);
		showMatrix(B);
		showMatrix(F);

	}

}
