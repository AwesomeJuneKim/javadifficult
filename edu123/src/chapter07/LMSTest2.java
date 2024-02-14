package chapter07;

public class LMSTest2 {

	public static void main(String[] args) {
		
		String name="홍길동";
		int age=20;
		String subject="자바";
		
		Professor p= new Professor(name, age, subject);
		
//		p.setName("박푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
		
		System.out.println(p.toString());
		
	}

}
