package chapter07.abstraction;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여= 기본급+판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스=기본급*12*4");
	}
}

class Consultant extends Employee {

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 급여= 기본급+컨설팅 특별수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 보너스= 기본급*12*2");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여= 기본급+팀 성과 수당");
	}
}

class Director extends Manager{

		@Override
		public void calcBonus() {
			// TODO Auto-generated method stub
			System.out.println("Director 보너스=기본금*12*6");
		}
}
public class HRSTest{
	public static void calcTax(Employee X) {
		System.out.println("소득세를 계산합니다.");
	}
		public static void main(String[] args) {
			Salesman s= new Salesman();
			Employee e= new Salesman();
			//Salesman은 Employee보다 하위 개념이므로 세일즈맨을 임플로이에 대입할 수 있지만
			//임플로이를 세일즈맨에 대입할 수 없다.
			Consultant c= new Consultant();
			Director d= new Director();
			HRSTest h= new HRSTest();
			
			h.calcTax(d);
			//HRSTest의 calcTax를 호출해서 임플로이대신 디를 입력할 수 있으므로 해당바디가 출력된다.
			calcTax(s);
			calcTax(c);
			calcTax(d);
			//calcTax메소드에 static이 없다면 실행 될 수 없다. 
			//위의 방법처럼 클래스의 인스턴스를 통해 호출해야 출력된다.
			
			s.calcSalary();
			s.calcBonus();
			c.calcBonus();
			d.calcBonus();
			
			System.out.println(s.toString());
			System.out.println(c.toString());
			System.out.println(d.toString());
			
			if(s.equals(c)) {
				System.out.println("동일한 객체입니다.");
			}else {
				System.out.println("서로 다른 객체입니다.");
			}
		}
	}
