import java.util.Scanner;

public class assignment6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 10���� ���ڸ� �Է¹޾Ƽ� ù ��° �� ��° �ϰ� ��° �Է¹��� ���ڸ� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� : A B C D E F G H I J  ��� : A D G
		
		
		
		Scanner in = new Scanner(System.in);
		
		
		String input = in.nextLine();
		String [] arr = input.split(" ");
		
		System.out.print(arr[0]+""+arr[3]+""+arr[6]);
		
		
		
		in.close();
	}

}
