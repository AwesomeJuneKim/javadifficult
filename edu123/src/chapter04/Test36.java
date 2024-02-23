package chapter04;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter='A';
		//int num처럼 char에 알파벳의 유니코드 값이 저장되어 있어서 
		//따로 변수의 내용을 입력하지 않아도 된다.
		
		int num='A';
		System.out.println("num="+num);
		char[] alphabet= new char[26];
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i]= (char)(letter+i);//유니코드를 다시 문자로 바꿈
		}//배열에 문자가 저장되어 있음
		for(char c: alphabet) {
			System.out.print(c+" ");//배열에 저장된 알파벳 출력
		}
	}

}
