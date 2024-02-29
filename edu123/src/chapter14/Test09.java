package chapter14;

interface Calculator {
	int func();
}

public class Test09 {

	static int num1 = 10;
	int num2 = 20;

	public static void main(String[] args) {

		Test09 test = new Test09();
		int num3 = 30;// 지역변수는 람다식에서 사용만 할 수 있고 수정할 수 없다.(final변수처럼 사용됨)

		Calculator calc = () -> {// 람다식 안에서 선언된 변수들은 수정할 수 있다.
			int num4 = 40;
			Test09.num1++;
			test.num2++;//test는 수정이 안되지만 test의 필드는 수정이 가능하다
			// num3++; 에러발생
			num4++;
			return num4;
		};

	}
}
