import java.util.Scanner;

public class assignment3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 남자는 'M' 여자는 'F'로 나타내기로하고 18세 이상을 성인이라고하자
		// 성별('M','F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자),"BOY"(미성년남자),
		// "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
		// 입력 예: F 15 / 출력 예: GIRL
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("성별을 입력하시오 ('M' 혹은 'F')? :");
		String gender = in.nextLine();
		
		System.out.println("나이를 입력하시오 : ");
		int age = in.nextInt();
		
		
		if((gender.equals("M")) && (age >= 18)) {
			System.out.println("MAN");
		}
		else if ((gender.equals("M")) && (age < 18)) {
			System.out.println("BOY");
		}
		else if ((gender.equals("F")) && (age >= 18)) {
			System.out.println("WOMAN");
		}
		else if ((gender.equals("F")) && (age < 18)) {
			System.out.println("GIRL");
		}
		
		in.close();
		
		
	}

}
