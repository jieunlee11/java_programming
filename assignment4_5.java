import java.util.Scanner;

public class assignment4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0�� �Էµ� ������ ������ ��� �Է¹޾� 3�� ����� 5�� ����� ������ ������ ������ ���

		Scanner in = new Scanner(System.in);
	
		int count = 0;
		
		while(true) {
			int num = in.nextInt();
			if(num==0)
				break;
			if(num%3!=0 && num%5!=0)
				count++;
		}
		
		
		System.out.print(count);
		
		in.close();
		
	}

}
