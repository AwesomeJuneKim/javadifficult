package selfStudy;

import java.util.Objects;

class Card{
		String kind;
		int number;
		
		Card(){
			this("SPADE",1);
		}
		Card(String kind, int number){
			this.kind=kind;
			this.number=number;
		}
		
		//equals는 객체의 주소를 비교하는거라서 내용을 비교하기 위해서는 오버라이딩 해줘야 한다.
		public boolean equals(Object obj) {
			if(!(obj instanceof Card))
				return false; 
			Card c= (Card)obj;
			return this.kind.equals(c.kind) && this.number==c.number;
		}
		//equals를 오버라이딩 하면 hashcode도 오버라이딩 해줘야 한다(source에 해쉬코드와 이퀄스 제너레이션 버튼이 있음)
		public int hashCode() {
			return Objects.hash(kind, number);//매개변수의 숫자는 실행에 관계없음(아무거나 넣어도 된다)
		}
		
		//toString을 아래처럼 오버라이딩하지 않으면 메인메서드의 toString은 객체의 주소를 출력하게 된다.
		public String toString() {
			return "kind:"+kind+", number:"+number;
		}
	}

	class Hash_toString {
		public static void main(String[] args) {
		Card c1=new Card();
		Card c2=new Card();
	
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}

