import java.util.Scanner;

public class assignment4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 ������ ���� ������ �Էµȴ�.
		// while ���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ���

	    Scanner in = new Scanner(System.in);

	    int number = in.nextInt();
	    int i = 1;
	    int sum = 0;
	    
	    while( i<=number) {
	    	sum += i;
	    	i++;
	    }
		
		System.out.println(sum);
		in.close();
	
	}

}
