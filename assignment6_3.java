import java.util.Scanner;

public class assignment6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1반부터 6반까지의 평균점수를 저장한 후 두 반의 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오.
		// 반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0 으로 초기화하고 
		// 출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.
		// 입력 : 1 3  출력: 168.7
		
		
		Scanner in = new Scanner(System.in);
		
		double[] arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		
		int class1 = in.nextInt();
		int class2 = in.nextInt();
		
        double sum = arr[class1-1]+arr[class2-1];
        
        System.out.println(sum);
        
        in.close();
        
	}

}
