import java.util.Scanner;

public class assignment4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력

		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		
		for(int i=n; i <= 100; i++) {
			sum += i;
		}
		
		
		System.out.print(sum);
		
		in.close();
		
	}

}
