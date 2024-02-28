package selfStudy;


public class Gugudan0 {

	public void printColumn(int col) {
        int numberOfColumns = 3; // 한 행에 출력할 열의 수

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                int dan = col + j;
                if (dan <= 9) {
                    System.out.print(dan + "x" + i + "=" + (i * dan) + "\t");
                } else {
                    break; // 9단을 넘어가면 종료
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Gugudan ggd = new Gugudan();
        ggd.printColumn(5); // 5단부터 출력합니다.

        System.out.println("END");
    }
	}
