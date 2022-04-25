import java.util.Scanner;

public class assignment3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1번은 개, 2번은 고양이, 3번은 병아리
		//번호를 입력하면 번호에 해당하는 동물을 영어로
		//해당 번호가 없으면 "I don't know." 라고 출력
		// 예 : 개-dog, 고양이-cat, 병아리-chick
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number? ");
		int num = in.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("dog");
			break;
		case 2 :
			System.out.println("cat");
			break;
		case 3 :
			System.out.println("chick");
			break;
		default :
				System.out.println("I don't know.");
		
		}
		in.close();
	
	}

}
