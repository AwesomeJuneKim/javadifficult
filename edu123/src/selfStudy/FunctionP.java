package selfStudy;

import java.util.function.Function;

class Geometry{}
class Circle extends Geometry{
	int radius;
	public Circle(int radius) {
		super();
		this.radius=radius;
	}
	public double calculator(){
		return radius*radius*3.14;
		
	}
	
}
class Triangle extends Geometry{
	int width;
	int height;
	public Triangle(int width, int height) {
		super();
		this.width=width;
		this.height=height;
	}
	public double calculator() {
		return width*height;
	}
}
class Rectangle extends Geometry{
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double calculator() {
		return width*height;
	}
}


public class FunctionP extends Geometry{
	public static void main(String[] args) {
		Function<Geometry, Double> func=(g)->{
			
		};
	}

}
