import java.util.Scanner;

public class assignment5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1���� 100������ ���� �� �� ���� �Է¹޾� 100���� ���� ������� ���ʷ� ����ϴٰ�
//		10�� ����� ��µǸ� ���α׷��� �����ϵ��� ���α׷��� �ۼ��Ͻÿ�.
//		
//		��: 7 ���: 7 14 21 28 35 42 49 56 63 70
//		
		
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
      	for(int i=1; i*num <= 100; i++) {
		
            System.out.print(i*num + " ");
			if((i*num) % 10 == 0){
		        break;
		
		}
		

		
	}
      	in.close();
}
}