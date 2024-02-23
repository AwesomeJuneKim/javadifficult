package chapter05;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		System.out.println("2");
		
		String num= takeoff(6, 7);
		
		System.out.println(num);
		System.out.println("3");
		System.out.println("4");
		
	}

	static String takeoff(int num1, int num2) {
		System.out.println("takeoff");
		
		return num1+"===>"+num2;
	}
}
