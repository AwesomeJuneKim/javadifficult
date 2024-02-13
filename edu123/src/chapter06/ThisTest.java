package chapter06;

public class ThisTest {

	int i=1;
	
	public void first() {
		int i=2;
		int j=3;
		this.i=i+j;//여러 메서트 내의 같은 변수가 있을 때, 해당 메서드 내의 변수를 표현하기 위함
		
		second(4);
		
	}
	public void second(int i)
	{
		int j=5;
		this.i=i+j;
	}
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
		System.out.println("Done");
	}
}
