package chapter14;

interface StringFunc{
	String modify(String s);
}
public class Test07 {
	
	static String test(StringFunc sf, String s) {
		return sf.modify(s);
	}
	
	public static void main(String[] args) {
		
		String str="Korea,Australia,China,Germany,Spain,Turkey";
		StringFunc sf1=(s)->{
			String result="";
			char c;
			for(int i=0; i<s.length();i++) {
				c=s.charAt(i);//인덱스를 이용해 알파벳 하나하나를 읽는다.
				if(c==',')//글자가 ,인 경우 
					result +=" ";//빈칸으로 만들어주고
				else
					result +=c;//아니라면 단어 그대로 들고감
			}
			return result;
		};
		
		String s1=test(sf1,str);
		System.out.println(s1);
		
		String s2= test((s)->{
			int max=0;
			int index=0;
			String[] word=s.split(",");
			for(int i=0;i<word.length;i++) {
				if(max<word[i].length()) {
					max=word[i].length();
					index=i;
				}
			}
			return word[index];
			
		}, str);
		System.out.println(s2);
	}

}
