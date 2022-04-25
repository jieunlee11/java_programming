
public class assignment4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래와 같이 출력되는 프로그램 작성
		// 2 3 4 5 6
		// 3 4 5 6 7
		// 4 5 6 7 8
		// 5 6 7 8 9
		// 6 7 8 9 10



		
		for(int x = 2; x <= 6; x++) {
			for(int y = x; y < x+4; y++) {
				System.out.print(y + " ");
			}
				System.out.println();
		}
					
		
	}


}
