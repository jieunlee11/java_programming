import java.util.Scanner;

public class assignment5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		자연수 n을 입력받아 "출력 예"와 같이 n x n 크기에 공백으로 구분하여 출력
//		10 미만의 홀수만 출력하시오.
//		주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//		입력 : 3
//		출력 : 1 3 5
//		      7 9 1
//		      3 5 7
//	
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int num = 1;
		
		
		for(int i = 0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(num + " ");
				num = (num+2)%10;
			}
			System.out.println();
		}
		
		in.close();
	}

}
