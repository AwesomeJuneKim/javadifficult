package selfStudy;

public class Gugudan {

	public void printColumn(int col) {

		for (int i = 2; i <= 9; i += col) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < col; k++) {
					if (i + k <= col+1) {
						System.out.print((i + k) + " x " + j + " = " + ((i + k) * j) + "\t");
					}
				}
				System.out.println(); 
			}
			System.out.println();

		}
	}

}