import java.util.Scanner;

public class assignment5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성
//		
//		예: 3    출력: *****
//		              ***
//		               *

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
	    for(int i=1; i<=n; i++) {
		    for(int j=(2*n-1); j>=i; j--){
		    	if(i+j<=2*n) {
		    		System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
	}
		         System.out.println();
		}
		
		in.close();
		
	}

}
