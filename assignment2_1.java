import java.util.Scanner;

public class assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
//		System.out.println("두 개의 정수를 입력하시오.");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1 + " > " + num2 + " --- " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " --- " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " --- " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " --- " + (num1 <= num2));
		
		
		in.close();
		
		
	}

}
