package chapter13;

class Bag<T, N>{
	private T thing;
	private N name;
	
	public Bag(T thing, N name) {
		this.thing=thing;
		this.name=name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	void showType() {
		System.out.println("T의 타입은 "+ thing.getClass().getName());
		System.out.println("N의 타입은 "+ name.getClass().getName());
	}
	
}
class Book{
	public String toString() {
		return "책";
	}
}
class PencilCase{}
class Notebook{}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book, String> bag= new Bag<Book, String>(new Book(),"과학");
		//첫번째 제네릭이 book클래스 이므로 클래스에서 책을 반환하게 하고 그것을 출력하게 만들어야한다.
		bag.showType();
		
		Book book= bag.getThing();
		String name= bag.getName();
		
		System.out.println("This is: "+book);
		System.out.println("Name is: "+name);
		
		/*
		Bag<Book> bag= new Bag<>(new Book());
		Bag<PencilCase> bag2= new Bag<>(new PencilCase());
		Bag<Notebook> bag3= new Bag<>(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();
		*/
		//bag=bag2;
		//제네릭이 다르기 때문에 오류가 난다.
	}
	

}
