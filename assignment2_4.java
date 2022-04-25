import java.util.Scanner;

public class assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("민수의 키와 몸무게를 입력하세요.");
		int minsu1 = in.nextInt();
		int minsu2 = in.nextInt();
		System.out.print("기영이의 키와 몸무게를 입력하세요.");
		int kiyoung1 = in.nextInt();
		int kiyoung2 = in.nextInt();
		
		if((minsu1>kiyoung1) && (minsu2>kiyoung2)) {
				System.out.print("1");
		}
		else {
			System.out.print("0");
		}
		
		in.close();
		
	}

}
