import java.util.Scanner;

public class assignment3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� ��, 2���� �����, 3���� ���Ƹ�
		//��ȣ�� �Է��ϸ� ��ȣ�� �ش��ϴ� ������ �����
		//�ش� ��ȣ�� ������ "I don't know." ��� ���
		// �� : ��-dog, �����-cat, ���Ƹ�-chick
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number? ");
		int num = in.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("dog");
			break;
		case 2 :
			System.out.println("cat");
			break;
		case 3 :
			System.out.println("chick");
			break;
		default :
				System.out.println("I don't know.");
		
		}
		in.close();
	
	}

}
