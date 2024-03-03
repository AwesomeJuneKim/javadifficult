package chapter14_lamda;

import java.util.function.Function;

//선언한 인터페이스가없다-> 자바가 기본적으로 갖고있는 인터페이스를 사용하기 때문에
public class Test14_P {
	public static void main(String[] args) {
		Function<String, Integer> func=(s)->{
			int cnt=0;
			String [] wordList=s.split(" ");
			cnt=wordList.length;
		return cnt;	
		};
		int WordCnt=func.apply("간장 공장 공장장은 강공장장이고");
		System.out.println(WordCnt);
		//문자열과 정수를 사용할 람다식 생성 
			//단어수 표현할 변수 생성 

			//문자열 저장할 배열 생성, 파라미터를 이용해 단어를 나눈다.

			//단어 갯수를 단어수 변수에 저장한다.



		//위의 함수를 적용할 문자열을 변수에 저장한다.

		//출력한다.

	}

}
