import java.util.Scanner;

public class assignment5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		�ڿ��� n�� �Է¹޾Ƽ� n�ٸ�ŭ ������ ���� ����ϴ� ���α׷��� �ۼ�
//		
//		��: 3    ���: *****
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
