package chapter11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03_FileInputStream {

	public static void main(String[] args) {
		try(FileInputStream fi= new FileInputStream("a.txt")){
			int c= fi.read();
			System.out.println((char)c);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
