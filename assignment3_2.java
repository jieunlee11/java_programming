import java.util.Scanner;

public class assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A �̸� "Excellent"
		// B �̸� "GOOD"
		// C �̸� "Usually"
		// D �̸� "Effort"
		// F �̸� "Failure"
		// �� �� �����̸� "error"
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �빮�ڸ� �Է��Ͻÿ�.");
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
