import java.util.Scanner;

public class assignment5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2���� 9������ �� �� 2���� �Է¹޾� �Է¹��� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�� �ݵ�� ���� �Էµ� ���� �����ܺ��� �Ʒ��� ���Ŀ� �°� ����Ͽ��� �Ѵ�.
//������ ������ ������ 3ĭ�̴�.		
		

		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		//A = 5 B = 3
		
		if(A>B) {
		for(int j = 1; j < 9; j++) {
			for(int i = A; i >= B; i--) {
				System.out.printf("%d * %d = %2d   ",i,j,i*j);
			}
			System.out.println();
		}
		}
		else {
			for(int j = 1; j < 9; j++) {
				for(int i = A; i <= B; i++) {
					System.out.printf("%d * %d = %2d   ",i,j,i*j);

			 }
				System.out.println();
			}
		}
		
		
		in.close();
		
	}

}
