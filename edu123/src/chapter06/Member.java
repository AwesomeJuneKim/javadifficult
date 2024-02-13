package chapter06;

public class Member {
	private String name;
	private int age;
	
	public Member() {
	this("guest");
	}
	
	public Member(String name) {
		this(name,0);
	}
	public Member(String, int age) {
		this.name = name;
		this.age = age;
	}

/*	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	public Member(String name) {
		System.out.print("Member(String) 생성자 실행:");
		System.out.println(name);		
	}
	public Member(String name, int age) {
		System.out.print("Member(String,int) 생성자 실행:");
		System.out.print(name+":"+age);
	}*/
	
	public void setName(String name) {
		
	}
	@Override
	public String toString() {
		return name+":"+age;
		//System.out.println(m.toString);
		//물어보기
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("main()메서드 실행");
		Member m1=new Member();
		Member m2=new Member("Amy");
		Member m3=new Member("Amy", 23);
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
		System.out.println("m3:"+m3);
	
	}
}
