package chapter14_lamda;

import java.util.function.Function;

//선언한 인터페이스가없다-> 자바가 기본적으로 갖고있는 인터페이스를 사용하기 때문에
public class Test14 {
	public static void main(String[] args) {
		Function<String, Integer> func =(s)->{ //Function이라는 API를 사용함
			int cnt=0;
			String[] word=s.split(" ");
			cnt=word.length;
			return cnt;
		};
		int wordCnt=func.apply("고개를 들어 별들을 보라 당신 발만 내다 보지말고");
		System.out.println("단어 수 : "+wordCnt);
	}

}
