package edu123;

public class Test3 {

	private String name;
	private int age;
	
	public Test3() {
		this("guest");
		}
	public Test3(String name) {
		this(name,0);
	}
	public Test3(String name, int age) {
		this.name= name;
		this.age= age;
	}
	public String toString() {
		return name+":"+age;
	}
	public static void main(String[] args) {
		Test3 t1=new Test3();
		Test3 t2=new Test3("Amy");
		Test3 t3=new Test3("Amy",23);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}
}
