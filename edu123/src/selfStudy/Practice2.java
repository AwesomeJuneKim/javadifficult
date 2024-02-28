package selfStudy;

interface Numberfunc {
	int func(int n);
}

public class Practice2 {
	public static void main(String[] args) {
		Numberfunc sum=(n)->{
			int result=0;
			for(int i=0; i<=n;i++) {
				if(i%2==0) {
					result +=i;
				}
			} return result;
		};
		Numberfunc osum=(n)->{
			int result=0;
			for(int i=0; i<=n;i++) {
				if(i%2==1) {
					result+=i;
				}
			}
			return result;
		} ;
	System.out.println(sum.func(10));
	System.out.println(osum.func(100));
	}
}
