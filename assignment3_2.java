import java.util.Scanner;

public class assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A 이면 "Excellent"
		// B 이면 "GOOD"
		// C 이면 "Usually"
		// D 이면 "Effort"
		// F 이면 "Failure"
		// 그 외 문자이면 "error"
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("영문 대문자를 입력하시오.");
		String capital = in.nextLine();
		
		switch(capital) {
		case "A" :
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C" :
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;
		case "F" :
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
	

	
		in.close();
		
		
	}

}
