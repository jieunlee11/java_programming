import java.util.Scanner;

public class assignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸� �� ������
		// ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� ��: 100 / ��� ��: 10 100
		
	
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int cnt = 0;
         int sum = 0;
         
         
         for(int i=1; sum < num; i++) {
        	 if(i%2==1) {
        		 sum+=i;
        		 cnt++;
        	 }
         }
         
         System.out.printf("%d %d", cnt, sum);
         in.close();
	}

}
