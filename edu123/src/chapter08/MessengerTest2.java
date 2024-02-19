package chapter08;
interface Messenger{
	String getMessage();
	void setMessage(String msg);
}

public class MessengerTest2 {
public static void main(String[] args) {
	//여기서부터->
	Messenger test= new Messenger() {
		
		public void setMessage(String msg) {
			System.out.println("메시지: "+ msg);
		}
		public String getMessage() {
			return "test";
		}
	};//<-여기까지 인터페이스 메신저를 구현한 추상클래스이다.
	//인터페이스는 추상메서드로만 이루어져 있어서 객체를 만들 수 없다.
	//따로 클래스를 만들어서 인터페이스이용해 클래스를 완성해야 객체를 만들 수 있음
	System.out.println(test.getMessage());
	test.setMessage("have a nice day!");
}
}
