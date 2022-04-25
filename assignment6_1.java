import java.util.Scanner;

public class assignment6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
		// 입력 : A B C D E F G H I J  출력 : A D G
		
		
		
		Scanner in = new Scanner(System.in);
		
		
		String input = in.nextLine();
		String [] arr = input.split(" ");
		
		System.out.print(arr[0]+""+arr[3]+""+arr[6]);
		
		
		
		in.close();
	}

}
