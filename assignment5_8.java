import java.util.Scanner;

public class assignment5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		
//		�ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷� �ۼ�
//		����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
//		�Է� : 3
//		��� : 1 2 3 
//		        4 5
//		          6

	
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	int d = 1;
	
	for(int i=0; i < n; i++) {
//		System.out.print(i+ " ");
		for(int j=0; j<i; j++) {
			System.out.print("  ");
		}
		for(int j=0; j<n-i; j++) {
			System.out.printf("%d ", d++);
		}
		System.out.println(" ");
	}
	
	
	
	in.close();
	}

}
