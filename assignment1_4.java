import java.util.Scanner;

public class assignment1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ���� ������ �Է¹޾� �հ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�� ����� �Ҽ� ���ϸ� �����Ͽ� ���� �κи� ����Ѵ�.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��Ͻÿ�.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		int avg = sum/3;
		
		
		System.out.println("sum = " + sum);
		System.out.printf("avg = "+ avg);
		
		
		
        sc.close();

		
	}

}
