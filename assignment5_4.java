import java.util.Scanner;

public class assignment5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		�ڿ��� n�� �Է¹޾Ƽ� n�ٸ�ŭ ������ ���� ����ϴ� ���α׷��� �ۼ�
//		
//		��: 5    ���: *
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
