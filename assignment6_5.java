import java.util.Scanner;

public class assignment6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//100���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0�� �ԷµǸ� 
		//0�� �����ϰ� �� ������ �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� : 3 5 10 55 0    ��� : 55 10 5 3 
		
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