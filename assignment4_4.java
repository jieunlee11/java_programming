import java.util.Scanner;

public class assignment4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 이하의 양의 정수만 입력된다
		// while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력

	
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int i = 1;
		
		while((i <= num)) {
		       sum += i;
		         i++;
		       
		}
	
		
		
		System.out.println(sum);
		
		in.close();
		
	}

}
