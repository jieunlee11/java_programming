import java.util.Scanner;

public class assignment5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성
//		주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
//	    입력: 3  출력:     1
//	                  1 2
//	                1 2 3

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j--){
			
			System.out.print(" ");
		}
			
			System.out.println();
		}
		
		
		
		in.close();
		
	}

}
