import java.util.Scanner;

public class assignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지
		// 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
		// 입력 예: 100 / 출력 예: 10 100
		
	
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int cnt = 0;
         int sum = 0;
         
         
         for(int i=1; sum < num; i++) {
        	 if(i%2==1) {
        		 sum+=i;
        		 cnt++;
        	 }
         }
         
         System.out.printf("%d %d", cnt, sum);
         in.close();
	}

}
