import java.util.Scanner;

public class assignment5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		
//		자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램 작성
//		주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//		입력 : 3
//		출력 : 1 2 3 
//		        4 5
//		          6

	
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	int d = 1;
	
	for(int i=0; i < n; i++) {
//		System.out.print(i+ " ");
		for(int j=0; j<i; j++) {
			System.out.print("  ");
		}
		for(int j=0; j<n-i; j++) {
			System.out.printf("%d ", d++);
		}
		System.out.println(" ");
	}
	
	
	
	in.close();
	}

}
