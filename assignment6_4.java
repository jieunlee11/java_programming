import java.util.Scanner;

public class assignment6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// ����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
		// �Է� 95 100 88 65 76 89 58 93 77 99  ���  sum : 446 
		                                         //avg : 78.8  
		
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[10];
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = in.nextInt();
			if((i+1)%2==0) {
				sum += num[i];
			}	
			else {
				avg += num[i];
				cnt++;
				
			}
		}
		
		System.out.printf("sum : %d\navg : %.1f\n", sum, avg/cnt);
		
		in.close();
	}

}
