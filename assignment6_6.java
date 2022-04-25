import java.util.Scanner;

public class assignment6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오
		// (입력받을 정수는 1000을 넘지 않는다.)
		// 입력 : 5 10 8 55 6 31 12 24 61 2  출력 : 2
		
		
		Scanner in = new Scanner(System.in);
		
		int [] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
			
			
		}
		
		
		
				
		in.close();
	}

}

