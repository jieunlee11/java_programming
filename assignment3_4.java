import java.util.Scanner;

public class assignment3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // 1~12������ ������ �Է¹޾�, �Է¹��� ���� �Է¹޾� ����� ���
		  // �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		  // �Է� ��: 2 ��� ��: 28
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		int month = in.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("31");
			break;
		}
		
		in.close();
		
	}
}
