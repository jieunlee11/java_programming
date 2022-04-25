import java.util.Scanner;

public class assignment3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
		// hint! 400으로 나누어떨어지면 윤년이다. 또는 4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년이다.
		// 입력 예: 2008 / 출력 예: leap year
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("년도를 입력하시오 : ");
		int year = in.nextInt();
		
		
		if(year%400 == 0 || year%4==0 && year%100 != 0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
		
		
		in.close();
	}

}
