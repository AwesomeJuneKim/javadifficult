package chapter13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Check {
	String name();

	int val();
}

public class AnnoTest {
	@Check(name = "first", val = 123)
	public static void test() {
		AnnoTest obj = new AnnoTest();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");

			//실행시점에 Check()가 있어야 해당 클래스가 실행된다.
			Check check = m.getAnnotation(Check.class);
			System.out.println(check.name() + ":" + check.val());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		test();
	}
}
