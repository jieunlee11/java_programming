import java.util.Scanner;

public class assignment5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��� ���� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		��: 3 4  ���: 1 2 3 4
//		             2 4 6 8 
//		             3 6 9 12

		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= y; j++) {
				
				System.out.print(i*j + " ");
			}
			
			System.out.println();
		}
		
		
		in.close();
		
		
	}

}
