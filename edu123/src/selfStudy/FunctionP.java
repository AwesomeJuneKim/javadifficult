package selfStudy;

import java.util.function.Function;

//최상위 추상클래스 생성(추상메서드로 면적 구하는 메서드 하나 선언)
abstract class Geometry {
	abstract double getArea();
}
//자식 클래스들 생성(원, 삼각형, 직사각형)
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
		//Function 람다생성
		Function<Geometry, Double> func = (g) -> { // Function이라는 API를 사용함
			return g.getArea();
		};
		//출력
		System.out.println("원 면적 : " + func.apply(new Circle(5)));
		System.out.println("삼각형 면적 : " + func.apply(new Triangle(5, 10)));
		System.out.println("사각형 면적 : " + func.apply(new Rectangle(6, 12)));

	}

}
