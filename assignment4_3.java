import java.util.Scanner;

public class assignment4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� �ڿ����� �Է¹޾� �� ���� ����� ���ʷ� 10�� ���

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(num*i);
		}
		
		in.close();
		
	}

}
