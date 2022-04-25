import java.util.Scanner;

public class assignment6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오
		// 평균은 반올림하여 소수첫째자리까지 출력한다.
		// 입력 95 100 88 65 76 89 58 93 77 99  출력  sum : 446 
		                                         //avg : 78.8  
		
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[10];
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = in.nextInt();
			if((i+1)%2==0) {
				sum += num[i];
			}	
			else {
				avg += num[i];
				cnt++;
				
			}
		}
		
		System.out.printf("sum : %d\navg : %.1f\n", sum, avg/cnt);
		
		in.close();
	}

}
