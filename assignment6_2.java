import java.util.Scanner;

public class assignment6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//����� �ݿø��Ͽ� �Ҽ� ù°�ڸ������� �Ѵ�.
		// �Է� : 23.2 39.6 66.4 50.0 45.6 48.0    ��� : 45.5
		

	    Scanner in = new Scanner(System.in);
	    
	    double [] arr =  new double[6];
	    
	    double sum = 0;
	    double average = 0;
	    
	    for(int i = 0; i < 6; i++) {
	    	arr[i] = in.nextDouble();
	    	
	    	sum += arr[i];
	    }
	    
	    average = sum/6;
	    
	    Math.round(average);
	    
	    System.out.printf("%.1f",average);
	    
	    
	   in.close(); 
	}

}
