package edu123;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] score= {79,88,91,33,100,55,95};
		
		int max= score[0];
		int min= score[0];
		
		for(int i=1;i<score.length;i++) {//i는 0이 아닌 1으로 설정한다(자기자신과 비교할 필요 없음)
			if(score[i]>max) {//앞부터 차례대로 비교하며 가장 큰 수를 찾는다.
				max= score[i];
			}else if (score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
