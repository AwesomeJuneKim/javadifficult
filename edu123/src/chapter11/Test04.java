package chapter11;

public class Test04 {
	public static void test() throws Exception{
		int t=10/0;

//		try(FileInputStream fi= new FileInputStream("a.txt")){
//			int c;
//			while((c= fi.read())!=-1) {
//			
//			System.out.print((char)c);
//			}
//		}
//			catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
}
		public static void main(String[] args) {
			System.out.println("start");
			try {
				test();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("end");
	}

}
