package chapter04;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 생성하기
		Random rnd= new Random();
		int [] score= new int[20];
		
		int sum=0;
		double avg=0.0;
		int max=0;
		int min=999;
		
		for(int i =0; i<score.length; i++) {//20개의 칸에 1~20 입력 됨
			score[i] = rnd.nextInt(20);//배열에 20이하의 정수 생성
			//rnd. ->rnd에 적용할 함수가 나열된다.
		}
//		for(int num: score)
//			System.out.println(num);
		for(int i=0;i<score.length;i++)	{	
			System.out.println(score[i]+" ");
			if(i%5==4)
				System.out.println();
		}
		for(int i=0; i<score.length; i++) {//최댓값, 최솟값 생성
			sum += score[i];
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		avg=sum/score.length;//평균 생성
		
//		for(int num: score)
//			System.out.println(num);//모든 난수 나열
		
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
	}

}
