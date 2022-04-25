import java.util.Scanner;

public class assignment4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(num*i);
		}
		
		in.close();
		
	}

}
