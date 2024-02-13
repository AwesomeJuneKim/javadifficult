package com.ruby.java.ch05;

class Armor {
//접근제한자 p.184
	private String name="홍길동";
	private int height=190;
	private int weight=100;
	private String color="red";
	
	void takeoff() {
		System.out.println("take off");
	}
	private void land() {
		System.out.println("land");
	}
	private void shootlaser() {
		System.out.println("shootlaser");
		//private void는 해당 클래스 내에서만 사용가능하다.
	}
}
public class ArmorTest {
	public static void main(String[] args) {
		Armor armor= new Armor();
		
		armor.takeoff();//메소드 호출(보이드 테이크오프가서 실행 후 다시 돌아옴)
		//takeoff는 디폴트라서 다른 클래스에도 사용가능
	}
	}
