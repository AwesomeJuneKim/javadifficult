package selfStudy;

import java.util.function.Function;

abstract class Geometry {
	abstract double getArea();
}

class Circle extends Geometry {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}

}

class Triangle extends Geometry {
	int width;
	int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return (double) width * height;
	}
}

class Rectangle extends Geometry {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return (double) width * height * 0.5;
	}
}

public class FunctionP {
	public static void main(String[] args) {
		Function<Geometry, Double> func = (g) -> { // Function이라는 API를 사용함
			return g.getArea();
		};
		System.out.println("원 면적 : " + func.apply(new Circle(5)));
		System.out.println("삼각형 면적 : " + func.apply(new Triangle(5, 10)));
		System.out.println("사각형 면적 : " + func.apply(new Rectangle(6, 12)));

	}

}
