package selfStudy;

public class Gugudan {

	public void printColumn(int col) {
		
		for(int i=1; i<=9; i++) {
			while(col<4) {
			for(int j=2; j<=9;j++) {
				
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			}
			System.out.println();

				//System.out.println();
		
		

		}

	}

	
	
}
