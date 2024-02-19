package chapter06;

public class MatrixQuiz {

	int [][]mA= {//3*4
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	int [][]mB= {//4*3
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
	};
	Integer [][]mR= new Integer[3][3];
	
	public void multiple() {
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				mR[i][j]=0;
				for(int k=0;k<4;k++) {
					mR[i][j]+=mA[i][k]*mB[k][j];
				}
			}
		}
	for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mR[i][j]+" ");
			}
			System.out.println();
		}
	}
	//public void print(){}
/*	public void print() {		//line29를 풀어쓰면
		for(int i=0; i<mR.length;i++) {
			for(int j=0; i<mR[0].length;j++) {
				System.out.print(mR[i][j]+"/t");
			}
			System.out.println();
		} 
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixQuiz mq= new MatrixQuiz();
		mq.multiple();
		//mq.print();
		//Test t1= new Test();
		//t1.multiple();
		//t1.print();
		
	}

}
