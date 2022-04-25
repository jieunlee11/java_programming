import java.util.Scanner;

public class assignment6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력
		// first array
		// 1 2 3 4
		// 5 6 7 8 
		// second array
		// 1 4 7 8
		// 3 6 9 8
		
		Scanner in = new Scanner(System.in);
		
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		int[][]	arr3 = new int[2][4];
		
		
		System.out.println("first array");
		for (int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arr1[i][j]= in.nextInt();
			}
		}
		
		System.out.println("secondary array");
		for (int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arr2[i][j]= in.nextInt();
			}
		}
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<4; j++) {
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
		}
		
		System.out.println();
		
		in.close();
	}

}

