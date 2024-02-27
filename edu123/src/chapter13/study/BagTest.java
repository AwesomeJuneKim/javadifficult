package chapter13.study;

class Bag<T extends Solid>{
	private T thing;
	
	public Bag(T thing) {
		this.thing=thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 "+ thing.getClass().getName());
	}
	
}
class Solid{}
class Liquid{}
class Book extends Solid{}
class PencilCase extends Solid{}
class Notebook extends Solid{}

class water extends Liquid{}
class coffee extends Liquid{}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag= new Bag<>(new Book());
		Bag<PencilCase> bag2= new Bag<>(new PencilCase());
		Bag<Notebook> bag3= new Bag<>(new Notebook());
		
		Bag<Water> bag4= new Bag<>(new Water());
		Bag<Coffee> bag5= new Bag<>(new Coffee());
		//부모 제네릭이 다르므로 에러가 난다.
	}
	

}
