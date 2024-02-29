package chapter14_lamda;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");

	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");

	}
}

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			//추상클래스는 위와같이 호출할 수 없지만 인터페이스는 가능하다->익명클래스
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");

			}
		};
		return mi;
	}

	public static void main(String[] args) { 

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();

		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		test(mc1);
		test(mi);

		mi.print();//1+선언과 동시에 출력???
		//2+ mi를 여러번 호출할 경우 위와같은 방식으로 사용
		//2+ 아래의 방식은 한번만 호출하고 없엘경우 사용
		
		//2+변수선언 없이 출력
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print();
		MyInterface mi2 = test2();
		mi2.print();
	}

}
