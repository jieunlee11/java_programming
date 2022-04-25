import java.util.Scanner;

public class assignment5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
//단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
//구구단 사이의 공백은 3칸이다.		
		

		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		//A = 5 B = 3
		
		if(A>B) {
		for(int j = 1; j < 9; j++) {
			for(int i = A; i >= B; i--) {
				System.out.printf("%d * %d = %2d   ",i,j,i*j);
			}
			System.out.println();
		}
		}
		else {
			for(int j = 1; j < 9; j++) {
				for(int i = A; i <= B; i++) {
					System.out.printf("%d * %d = %2d   ",i,j,i*j);

			 }
				System.out.println();
			}
		}
		
		
		in.close();
		
	}

}
