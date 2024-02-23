package chapter11;

public class Test01_Exception {

	public static void main(String[] args) {
		test1();
			System.out.println("GOOD");
	}
			
		private static void test1() {
			System.out.println("test2 start");
			test2();
			System.out.println("test1 end");
		}
		private static void test2() {
			System.out.println("test1 start");
		
		try {
			String s = new String("JAVA");
			int len = s.length();
			s = null;
			s.length();//에러가 발생했으므로 여기서 바로 캐치로 간다.
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		} catch(NullPointerException e2) {
			e2.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류 발생: "+e);
		}
		System.out.println("test2 end");
	}

}
