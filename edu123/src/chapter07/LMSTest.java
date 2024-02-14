package chapter07;

public class LMSTest {

	public static void main(String[] args) {
		
		Employee e= new Employee();
		Professor p= new Professor();
		Student s= new Student();
		
		e.setName("오정임");//e.name()은 사용할 수 없다.부모클래스에서 프라이빗으로 생성되었기 때문에
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("박푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		//person에는 이름과 나이만 있으므로 toString은 그 두개만 출력된다.


	}

}
