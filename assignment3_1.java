import java.util.Scanner;

public class assignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력
		
		
	
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		if (num == 0) {
			System.out.println("zero");
		}
		else if (num > 0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		
		in.close();
		
		
	}

}
