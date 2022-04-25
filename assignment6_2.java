import java.util.Scanner;

public class assignment6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
		//출력은 반올림하여 소수 첫째자리까지로 한다.
		// 입력 : 23.2 39.6 66.4 50.0 45.6 48.0    출력 : 45.5
		

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
