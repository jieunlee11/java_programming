import java.util.Scanner;

public class assignment1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("yard? ");
		double yard = in.nextDouble();
				
		
		System.out.printf(yard + "yard = %.1fcm", yard*91.44);
		
		

		
		in.close();
		
	}

}
