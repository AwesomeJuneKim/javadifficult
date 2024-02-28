package selfStudy;

public class Gugudan {

	public void printColumn(int col) {
		
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=col+1;j++) {
			System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
			
				//System.out.println();
		
		

		

	}

	
	
}
	public static void main(String[] args) {
		Gugudan ggd= new Gugudan();
		ggd.printColumn(4);
		
		System.out.println("END");
	}
}
