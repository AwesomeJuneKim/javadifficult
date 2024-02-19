package chapter07;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
