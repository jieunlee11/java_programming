import java.util.Scanner;

public class assignment4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100������ ������ �Է¹޾Ƽ� �Է¹��� �������� 100������ ���� ���

		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		
		for(int i=n; i <= 100; i++) {
			sum += i;
		}
		
		
		System.out.print(sum);
		
		in.close();
		
	}

}
