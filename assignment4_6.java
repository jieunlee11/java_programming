import java.util.Scanner;

public class assignment4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고,
		//"Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y'나 'y'이면 작업을 반복하고
		//다른 문자이면 종료하는 프로그램(넓이는 반올림하여 소수 첫째자리까지 출력한다.)

		
		Scanner sc = new Scanner(System.in);
		
		double base = 0;
		double Height = 0;
		double width = 0;
		char y;
		
		
		while(true) {
			
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			Height = sc.nextInt();
		
			width = base*Height/2;
			System.out.printf("Triangle width = %.1f\n", width);
			
			System.out.println("continue? ");
			y = sc.next().charAt(0);
		
		  
			if(y=='y'||y=='Y')
				continue;
			else
				break;
			
		    
		
		}
		sc.close();
	}

}
