import java.util.Scanner;

public class assignment3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⵵�� �Է¹޾� ����(leap year)���� ���(common year)���� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// hint! 400���� ����������� �����̴�. �Ǵ� 4�� ����������� 100���� ����������� ������ �����̴�.
		// �Է� ��: 2008 / ��� ��: leap year
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��Ͻÿ� : ");
		int year = in.nextInt();
		
		
		if(year%400 == 0 || year%4==0 && year%100 != 0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
		
		
		in.close();
	}

}
