import java.util.Scanner;

public class assignment5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		�ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ�
//		����! ���ڸ� �������� �����ϵ� �ٻ��̿� ������ ����.
//	    �Է�: 3  ���:     1
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
