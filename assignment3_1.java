import java.util.Scanner;

public class assignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �Է¹޾� 0 �̸� "zero" ����̸� "plus" �����̸� "minus" ��� ���
		
		
	
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		if (num == 0) {
			System.out.println("zero");
		}
		else if (num > 0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		
		in.close();
		
		
	}

}
