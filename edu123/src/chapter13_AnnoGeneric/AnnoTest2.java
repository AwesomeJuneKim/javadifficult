package chapter13_AnnoGeneric;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Mapping {
	String mode();
	int value();
}//Mapping 어노테이션 선언

@Retention(RetentionPolicy.RUNTIME)
@interface Comment {
	String msg();
}//Comment 어노테이션 선언

@Mapping(mode = "class", value = 100)//AnnoTest2 클래스에 적용하는 어노테이션
@Comment(msg = "Annotation2 Class")//AnnoTest2 클래스에 적용하는 어노테이션
public class AnnoTest2 {
	
	@Mapping(mode = "method", value = 200)
	@Comment(msg = "test() Method")
	public static void test() {
		AnnoTest2 obj = new AnnoTest2();
		try {
			Class<?> c = obj.getClass();
			//Class= 클래스의 정보를 갖고있는 클래스(메타데이터)
			Annotation annoList[] = c.getAnnotations();
			//해당 클래스에 선언되어 있는 어노테이션을 다 갖고와서 배열에 넣음
			System.out.println("클래스의 annotation 목록");
			for (Annotation item : annoList)
				System.out.println(item);

			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test()메서드의 annotation 목록");
			for (Annotation item : annoList)
				System.out.println(item);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		test();
	}
}
