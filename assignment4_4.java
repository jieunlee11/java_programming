import java.util.Scanner;

public class assignment4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 ������ ���� ������ �Էµȴ�
		// while ���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ���

	
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int i = 1;
		
		while((i <= num)) {
		       sum += i;
		         i++;
		       
		}
	
		
		
		System.out.println(sum);
		
		in.close();
		
	}

}
