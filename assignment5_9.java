import java.util.Scanner;

public class assignment5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		�ڿ��� n�� �Է¹޾� "��� ��"�� ���� n x n ũ�⿡ �������� �����Ͽ� ���
//		10 �̸��� Ȧ���� ����Ͻÿ�.
//		����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
//		�Է� : 3
//		��� : 1 3 5
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
