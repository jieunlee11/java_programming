import java.util.Scanner;

public class assignment1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오. (단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 세 개를 입력하시오.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		int avg = sum/3;
		
		
		System.out.println("sum = " + sum);
		System.out.printf("avg = "+ avg);
		
		
		
        sc.close();

		
	}

}
