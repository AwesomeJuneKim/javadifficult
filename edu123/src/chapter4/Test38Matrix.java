package chapter4;

public class Test38Matrix {

	// TODO Auto-generated method stub
//		int A[][]= new int[3][4];//난수 입력
//		int B[][]= new int[4][5];//난수 입력
//		int C[][]= new int[3][5];
//		int D[][]= new int[3][4];//난수 입력
//		int E[][]= new int[3][4];
//		int F[][]= new int[4][3];
	// C=A*B
	// E=A+D
	// F=A 전치 행렬
	public static void main(String[] args) {

		// 각각 난수 입력
		int[][] A = new int[3][4];
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				A[i][j] = rand.nextInt(501);
			}
		}

		int[][] B = new int[4][5];
		Random randTwo = new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				B[i][j] = randTwo.nextInt(501);
			}
		}
		int[][] D = new int[3][4];
		Random randThr = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				D[i][j] = randThr.nextInt(501);
			}
		}

		int[][] C = new int[3][5];

	public void multiple() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

	}

}
