package selfStudy;

public class Practice4 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i += col) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < 3; k++) {
					if (i + k <= 9) {
						System.out.print((i + k) + " x " + j + " = " + ((i + k) * j) + "\t");
					}
				}
				System.out.println();
			}
			System.out.println();

		}
	}

}
