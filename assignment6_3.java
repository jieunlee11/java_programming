import java.util.Scanner;

public class assignment6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0 ���� �ʱ�ȭ�ϰ� 
		// ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.
		// �Է� : 1 3  ���: 168.7
		
		
		Scanner in = new Scanner(System.in);
		
		double[] arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		
		int class1 = in.nextInt();
		int class2 = in.nextInt();
		
        double sum = arr[class1-1]+arr[class2-1];
        
        System.out.println(sum);
        
        in.close();
        
	}

}
