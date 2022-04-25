import java.util.Scanner;

public class assignment5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1부터 100까지의 정수 중 한 개를 입력받아 100보다 작은 배수들을 차례로 출력하다가
//		10의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
//		
//		예: 7 출력: 7 14 21 28 35 42 49 56 63 70
//		
		
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
      	for(int i=1; i*num <= 100; i++) {
		
            System.out.print(i*num + " ");
			if((i*num) % 10 == 0){
		        break;
		
		}
		

		
	}
      	in.close();
}
}