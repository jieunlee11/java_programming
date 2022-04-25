import java.util.Scanner;

public class assignment6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//호석이네 학교는 6학년이 네 반이 있는데 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다.
		//반별로 세 명이 제기를 찬 개수를 입력받아 각 반별로 제기를 찬 개수의 합계를 출력
		//반드시 배열을 이용하고 입력 후에 출력하는 방식
		// 1class? 15 2 35
		// 2class? 33 1 6
		// 3class? 5 10 19
		// 4class? 1 8 55

		Scanner in = new Scanner(System.in);
		
		int [][] student = new int[4][3];
		
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%dclass? ", i+1);
		
			for(int j=0; j<student[i].length; j++) {
			student[i][j] = in.nextInt();
		}
		}	
			
			for(int i = 0; i<student.length; i++) {
				int sum = 0;
			
				for(int j=0; j<student[1].length; j++) {
					
				sum += student[i][j];
			}
			
				System.out.printf("%dclass : %d\n", i+1, sum);
		}
			in.close();
	}

}

