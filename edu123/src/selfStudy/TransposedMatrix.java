package selfStudy;

public class TransposedMatrix {
	public static void main(String[] args) {
		
	
	//3*3 3*4 4*3 행렬 선언하기
	//각 행렬의 전치행렬 출력하기
	int [][] ma= {
			{3,4,5},
			{5,7,9},
			{23,56,10}
	};
	int [][] mb= {
			{90,80,70,50},
			{40,30,20,10},
			{11,22,33,44}
	};
	int [][] mc= {
			{91,82,73},
			{34,35,36},
			{67,68,69},
			{76,75,74}
	};
	int [][]mr= transposeMatrix(ma);
	
	for(int i=0; i<mr.length;i++) {
		for(int j=0; j<mr[0].length;j++) {
			System.out.print(mr[i][j]+" ");
			
		}
		System.out.println();
	}
	
	
	}

	private static int[][] transposeMatrix(int[][] ma) {
		int rows=ma.length;
		int cols=ma[0].length;
		int[][] mr=new int[cols][rows]
	}
}
