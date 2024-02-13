package chapter4;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=60;
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}//칸 이름으로 불러 내므로 길이보다 1작은 범위만큼 읽어야 한다.

	}

}
