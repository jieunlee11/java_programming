import java.util.Scanner;

public class assignment4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ﰢ���� �غ��� ���̿� ���̸� �Է¹޾� ���̸� ����ϰ�,
		//"Continue? "���� �ϳ��� ���ڸ� �Է¹޾� �� ���ڰ� 'Y'�� 'y'�̸� �۾��� �ݺ��ϰ�
		//�ٸ� �����̸� �����ϴ� ���α׷�(���̴� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)

		
		Scanner sc = new Scanner(System.in);
		
		double base = 0;
		double Height = 0;
		double width = 0;
		char y;
		
		
		while(true) {
			
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			Height = sc.nextInt();
		
			width = base*Height/2;
			System.out.printf("Triangle width = %.1f\n", width);
			
			System.out.println("continue? ");
			y = sc.next().charAt(0);
		
		  
			if(y=='y'||y=='Y')
				continue;
			else
				break;
			
		    
		
		}
		sc.close();
	}

}
