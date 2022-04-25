import java.util.Scanner;

public class assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		System.out.println(num1>num2 && num1>num3);
		System.out.println(num1==num2 && num2==num3);
		
		
		
		in.close();
		
	}

}
