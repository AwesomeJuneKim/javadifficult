package chapter08;


public class OuterClassTest {
	

	public static void main(String[] args) {
		OuterClass outer= new OuterClass();
		OuterClass.InstanceClass inner01=outer.new InstanceClass();
		//outer.InstanceClass inner02=outer.new InstanceClass();
		//참조변수 앞에는 클래스가 와야하는데 객체가 위치하므로 오류
		inner01.a=123;
		inner01.method2();
		
		OuterClass.StaticClass inner02= new OuterClass.StaticClass();
		inner02.b=456;
		inner02.method3();
		OuterClass.StaticClass.c=789;
		OuterClass.StaticClass.method4();

	}
	

}
