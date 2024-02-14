package chapter07;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		System.out.println("Person생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name+":"+age;
	}
	
	
}
