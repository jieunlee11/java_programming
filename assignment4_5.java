import java.util.Scanner;

public class assignment4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력

		Scanner in = new Scanner(System.in);
	
		int count = 0;
		
		while(true) {
			int num = in.nextInt();
			if(num==0)
				break;
			if(num%3!=0 && num%5!=0)
				count++;
		}
		
		
		System.out.print(count);
		
		in.close();
		
	}

}
