package chapter04;

public class Test32_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score= {90,85,78,100,98};
		//두번째 방법이 더 간결해서 잘쓰인다.
		
		//첫번째 방법과 두번째 방법의 혼합
		int[] score;
		score= new int[] {90,85,78,100,98};
		for(int i=0; i<score.length;i++) {
		System.out.println(score[i]);
		}
		//문자열의 길이 구하기(참조변수만 바꾸면 다양하게 알 수 있다.)
		String str="nice day";
		int snum=str.length();
		System.out.println(str+"은 "+snum+"글자 입니다.");

	}

}
