package selfStudy;

public class Gugudan0 {

	public static void main(String[] args) {
		Gugudan0 ggd = new Gugudan0();
		ggd.printColumn(3);

		System.out.println("END");
	}

	public void printColumn(int col) {

		for(int i=2;i<10; i+=col) {
			for(int j=1; j<10;j++) {
				for(int k=i;k<i+col && k<=9;k++) {
					System.out.print(k+"x"+j+"="+(k*j)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
