package chapter07;

public class Employee extends Person {

	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
