package homework;

public class T4 {
	package homework;

	public class T {
		/*
		 * 하나의 자바 파일에서 함수 구현 실습
		 */
		
			/*
			 * 행렬 덧셈, 곱셈 연산 메소드 정의 1차버젼: 덧셈후 바로 출력 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
			 */
			static void showMatrix(int[][] X) {
				// 2차원 모습으로 출력
				for(int i=0;i<X.length;i++) {
					for(int j=0;j<X.length;j++) {
						System.out.println(X[i][j]+" ");
					}
				}
			}
			static void getData(int[][]b){
				//static을 안붙이고 싶으면 메인메소드에 클래스의 참조변수를 연결해줘야 한다.
				
			}

			static int[][] addMatrix(int[][]B, int[][]C){
				
				return int[]
			}
			multiplyMatrix(B,E){
				
			}
			transposeMatrix(B){
				
			}

			public static void main(String[] args) {
				/*
				 * 난수 생성으로 초기화 A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5]; F[4][3]
				 * = B[3][4]의 전치 행렬
				 */
				System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
				getData(B);
				getData(C);
				getData(E);
				A = addMatrix(B, C);
				showMatrix(B);
				showMatrix(C);
				showMatrix(A);
				System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
				D = multiplyMatrix(B, E);
				showMatrix(B);
				showMatrix(E);
				showMatrix(D);
				System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
				F = transposeMatrix(B);
				showMatrix(B);
				showMatrix(F);

			}

	}

}
