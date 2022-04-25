import java.util.Scanner;

public class assignment6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100미만의 양의 정수들이 주어진다.
		// 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 그 때까지 입력된 정수의 십의 자리 숫자가
		// 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오 (0개인 숫자는 출력하지 않는다.)
		// 입력 10 55 3 63 85 61 85 0
		// 출력 0 : 1
//		       1 : 1
//		       5 : 1
//		       6 : 2
//		       8 : 2
//		       
		Scanner in = new Scanner(System.in);
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] cnt = new int[arr.length];
		
		while(true) {
			int num = in.nextInt();
			for (int i = 0; i < arr.length; i++) {
				if(num/10 == arr[i] && num !=0) {
					cnt[i]++;
					break;
				}
			}
			if(num == 0) {
				break;
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] !=0) {
				System.out.println(arr[i] + " : " + cnt[i]);
			}
		}
		
		
		in.close();
		
	
	}

}

