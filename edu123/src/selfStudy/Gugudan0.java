package selfStudy;


public class Gugudan0 {
		
	public static void main(String[] args) {
		Gugudan0 ggd= new Gugudan0();
		ggd.printColumn(3);
		
		System.out.println("END");
	}
	public void printColumn(int col) {
	    int count = 0; // 출력된 구구단의 개수를 기록하는 변수

	    for (int i = 1; i <= 9; i++) {
	        for (int j = 0; j < col; j++) {
	            int current = i + j * col;
	            if (current <= 9) {
	                System.out.print(current + " x " + col + " = " + (current * col) + "\t");
	            }
	        }

	        // 구구단이 출력될 때마다 count를 증가시키고, 3의 배수일 때 빈 줄을 출력
	        count++;
	        if (count % 3 == 0) {
	            System.out.println(); // 빈 줄 출력
	        }
	    }
	}

	}

