import java.util.Scanner;

public class assignment6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ȣ���̳� �б��� 6�г��� �� ���� �ִµ� �� ���� ��ǥ�� �� �� �����Ͽ� �������� ������ �Ͽ���.
		//�ݺ��� �� ���� ���⸦ �� ������ �Է¹޾� �� �ݺ��� ���⸦ �� ������ �հ踦 ���
		//�ݵ�� �迭�� �̿��ϰ� �Է� �Ŀ� ����ϴ� ���
		// 1class? 15 2 35
		// 2class? 33 1 6
		// 3class? 5 10 19
		// 4class? 1 8 55

		Scanner in = new Scanner(System.in);
		
		int [][] student = new int[4][3];
		
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%dclass? ", i+1);
		
			for(int j=0; j<student[i].length; j++) {
			student[i][j] = in.nextInt();
		}
		}	
			
			for(int i = 0; i<student.length; i++) {
				int sum = 0;
			
				for(int j=0; j<student[1].length; j++) {
					
				sum += student[i][j];
			}
			
				System.out.printf("%dclass : %d\n", i+1, sum);
		}
			in.close();
	}

}

