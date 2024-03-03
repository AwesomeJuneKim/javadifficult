package chapter14_lamda;

import java.util.function.Function;

//선언한 인터페이스가없다-> 자바가 기본적으로 갖고있는 인터페이스를 사용하기 때문에
public class Test14 {
	public static void main(String[] args) {
		//문자열과 정수를 사용할 람다식 생성 
		Function<String, Integer> func =(s)->{ //Function이라는 API를 사용함
			//단어수 표현할 변수 생성 
			int cnt=0;
			//문자열 저장할 배열 생성, 파라미터를 이용해 단어를 나눈다.
			String[] word=s.split(" ");
			//단어 갯수를 단어수 변수에 저장한다.
			cnt=word.length;
			return cnt;
		};
		//위의 함수를 적용할 문자열을 변수에 저장한다.
		int wordCnt=func.apply("고개를 들어 별들을 보라 당신 발만 내다 보지말고");
		//출력한다.
		System.out.println("단어 수 : "+wordCnt);
	}

}
