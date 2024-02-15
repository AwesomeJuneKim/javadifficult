package chapter07;

public class Professor extends Person {

	public Professor(String name, int age, String subject) {
		//super();//생략가능
		super(name,age);
		//디폴트 자식생성자는 디폴트 부모생성자를 호출한다. 
		//디폴트가 없을때는 부모 생산자의 매개변수를 따라 자식생산자의 매개변수를 변경해준다.
	System.out.println("Professor생성자");
	}
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		
		
	}
	@Override// 빈칸에 컨트롤+스패이스하면 상속되는 메서드를 검색할 수 있다(상속된 메서드에만 쓴다)
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+":"+subject;
		//return getName()+":"+getAge()+":"+getSubject();
	}
	
}
