package chapter11;

public class Test02 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			String s=null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
			return;// 제일 밑의 4는 출력되지 않는다.
		} finally {
			System.out.println("OK");
		} System.out.println("4");

	}

}
