package chapter06;

public class Armor {

	private String name;//private은 외부에서 불러올 수 없기 때문에 get또는 set이 필요하다.
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {//alt+shift+s ->제너레이트 게터세터
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Armor suit1=new Armor();//참조변수 suit1도 블럭이나 메소드안에 있으면 지역변수이다.
	//suit1.setName()
	
	
}
