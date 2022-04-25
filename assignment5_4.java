import java.util.Scanner;

public class assignment5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성
//		
//		예: 5    출력: *
//		             **
//		             ***
//		             ****
//		             *****
//		             
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
        for(int i=1; i<=n; i++){
        	for(int j=1; j<=i; j++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
        	
        	
        	
		in.close();
		
		
	}

}
