package chapter14_lamda;

interface StringFunction1{
	String modify(String s);
}
public class Test10 {
	
	static String func(String s) {
		String result="";
		char c;
		for(int i=0; i<s.length();i++) {
			c=s.charAt(i);
			if(c==',')
				result +=" ";
			else
				result +=c;
		}
		return result;
	}
	public static void main(String[] args) {
		
		StringFunc sf= Test10::func; 
		
		//위에 만들어준 반환타입과 매개변수가 적용할 애들과 같은 타입이어야한다.
		String str= "Korea,Australia,China,Germany,Spain,Turkey";
		String result= sf.modify(str);
		System.out.println(result);
		
		String str2="서울,북경,도쿄,뉴욕,발리";
		result=sf.modify(str2);
		System.out.println(result);
		}

}
