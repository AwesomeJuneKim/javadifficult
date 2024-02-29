package chapter14;

interface StringFunction2{
	String modify(String s);
}
public class Test10_1 {
	
	String func(String s) {
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
		
		Test10_1 obj= new Test10_1();
		StringFunc sf= obj::func; 
		
		//위에 만들어준 반환타입과 매개변수와 적용할 애들의 타입이 같아야한다.
		String str= "Korea,Australia,China,Germany,Spain,Turkey";
		String result= sf.modify(str);
		System.out.println(result);
		
		String str2="서울,북경,도쿄,뉴욕,발리";
		result=sf.modify(str2);
		System.out.println(result);
		}

}
