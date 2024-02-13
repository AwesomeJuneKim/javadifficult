package chapter06;

class Count {

	public static int totalCount;
	int count;
}

public class CountTest{
	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.count++;//디폴트 변수는 참조변수마다 생성되기 때문에 각각 계산된다.
		Count.totalCount++;//static은 공통변수이기 때문에 연산된 마지막값이 출력된다.
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		
		System.out.println(Count.totalCount+":"+c1.count);
		System.out.println(Count.totalCount+":"+c2.count);
		System.out.println(Count.totalCount+":"+c3.count);

	}
}
