package edu123;

	public class Matrix2 {
	    public static void main(String[] args) {
	        Random random = new Random();

	        int[] realArray = new int[24];
	        for(int i = 0; i < realArray.length; i++) realArray[i]=random.nextInt(10);
	        int[] arr = new int[24];
	        for(int i=0; i<realArray.length; i++) arr[i]=realArray[i];

	        System.out.println("--------------------------");
	        makeMatrix originalArray = new makeMatrix(), SortArray = new makeMatrix();
	        originalArray.setArray(realArray);
	        System.out.print("Original Arrays : ");
	        originalArray.printArray();
	        SortArray.setArray(arr);
	        SortArray.sortArray();
	        System.out.print("Sorted Arrays   : ");
	        SortArray.printArray();

	        System.out.println("--------------------------");
	        makeMatrix A = new makeMatrix(), B = new makeMatrix();
	        System.out.println("Make Matrix A");
	        A.setMatrix(A.make3_4Matrix(realArray, 0));
	        A.printMatrix();
	        System.out.println("Make Matrix B");
	        B.setMatrix(B.make3_4Matrix(realArray, 11));
	        B.printMatrix();

	        System.out.println("--------------------------");
	        makeMatrix sumofAB = new makeMatrix();
	        System.out.println("Matrix A+B");
	        sumofAB.setMatrix(sumofAB.sumMatrix(A.getMatrix(), B.getMatrix()));
	        sumofAB.printMatrix();

	        System.out.println("--------------------------");
	        makeMatrix A1 = new makeMatrix(), B1 = new makeMatrix(), mulofAB1 = new makeMatrix();
	        A1.setMatrix(A1.make3_4Matrix(realArray, 0));
	        B1.setMatrix(B1.make4_3Matrix(realArray, 11));
	        System.out.println("Make Matrix A1");
	        A1.printMatrix();
	        System.out.println("Make Matrix B1");
	        B1.printMatrix();
	        System.out.println("--------------------------");
	        System.out.println("Matrix A1*B1");
	        mulofAB1.setMatrix(mulofAB1.multipleMatrix(A1.getMatrix(), B1.getMatrix()));
	        mulofAB1.printMatrix();
	        System.out.println("--------------------------");

	        makeMatrix A2 = new makeMatrix(), B2 = new makeMatrix(), mulofAB2 = new makeMatrix();
	        A2.setMatrix(A2.make4_3Matrix(realArray, 0));
	        B2.setMatrix(B2.make3_4Matrix(realArray, 11));
	        System.out.println("Make Matrix A2");
	        A1.printMatrix();
	        System.out.println("Make Matrix B2");
	        B1.printMatrix();
	        System.out.println("--------------------------");
	        System.out.println("Matrix A2*B2");
	        mulofAB2.setMatrix(mulofAB2.multipleMatrix(A2.getMatrix(), B2.getMatrix()));
	        mulofAB2.printMatrix();
	        System.out.println("--------------------------");
	    }
	}

}
