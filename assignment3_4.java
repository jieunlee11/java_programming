import java.util.Scanner;

public class assignment3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // 1~12사이의 정수를 입력받아, 입력받은 월을 입력받아 평년의 경우
		  // 해당 월의 날수를 출력하는 프로그램을 작성하시오
		  // 입력 예: 2 출력 예: 28
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		int month = in.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("31");
			break;
		}
		
		in.close();
		
	}
}
