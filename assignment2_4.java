import java.util.Scanner;

public class assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("�μ��� Ű�� �����Ը� �Է��ϼ���.");
		int minsu1 = in.nextInt();
		int minsu2 = in.nextInt();
		System.out.print("�⿵���� Ű�� �����Ը� �Է��ϼ���.");
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
