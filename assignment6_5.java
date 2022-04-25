import java.util.Scanner;

public class assignment6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0이 입력되면 
		//0을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
		// 입력 : 3 5 10 55 0    출력 : 55 10 5 3 
		
		Scanner in = new Scanner(System.in);
		
		int [] arr = new int[100];
		

		for(int i =0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			
			if(arr[i] == 0) {
				for (int j = --i; j >=0; j--) {
					System.out.print(arr[j] + " ");
				}
				break;
				
	}
		
}
		in.close();
}
}