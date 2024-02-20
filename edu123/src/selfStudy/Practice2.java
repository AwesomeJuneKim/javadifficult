package selfStudy;

enum Mandarine {
	금귤(600), 한라봉(500),레드향(300), 천혜향(400), 황금향(800);
	
	private int price;
	
	Mandarine(int p){
		price = p;
	}

	public int getPrice() {
		return price;
	}
 
}
public class Practice2{
	public static void main(String[] args) {
		
		Mandarine ma= Mandarine.한라봉;
		if(ma==Mandarine.한라봉)
			System.out.println("ma는 한라봉 입니다.");
		System.out.println(ma+"가격: "+ma.getPrice());
		
		Mandarine list[]= Mandarine.values();
		System.out.println("==귤의 종류==");
		for(Mandarine m:list)
			System.out.println(m+":"+m.getPrice());
	}
}
