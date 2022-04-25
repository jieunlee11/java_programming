import java.util.Scanner;

public class assignment6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4행 2열의 배열을 입력받아 가로평균과 세로평균 그리고 전체 평균을 출력 (소수점 이하는 버림 한다.)
		// 16 27
		// 39 100
		// 19 88
		// 61 20
		
	
		Scanner in = new Scanner(System.in);
		
		int [][] arr = new int [4][2];
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
			arr[i][j] = in.nextInt();
			}
			}
		
			for(int i=0; i<arr.length; i++) {
			
		    int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			avg += sum;
			System.out.print((sum/2)+" ");
			}
		
			System.out.println();
	
		
			for(int i=0; i<2; i++) {
				
			int sum = 0;
			for(int j=0; j<4; j++){
				sum += arr[j][i];				
			}
			
			System.out.print((sum/4)+ " ");
			}
			
			System.out.println();
			System.out.println(avg/8);
		
		in.close();
	}

}

