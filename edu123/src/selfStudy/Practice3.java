package selfStudy;

import java.io.FileInputStream;

public class Practice3 {
	public static void test() throws Exception{
		try(FileInputStream fi= new FileInputStream("a.txt")){
			int c;
			while((c=fi.read())!=-1) {
				System.out.println((char)c);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			test();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
