import java.util.Scanner;

public class assignment6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100�̸��� ���� �������� �־�����.
		// �Է¹޴ٰ� 0�� �ԷµǸ� �������� �Էµ� 0�� �����ϰ� �� ������ �Էµ� ������ ���� �ڸ� ���ڰ�
		// ���� �� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ� (0���� ���ڴ� ������� �ʴ´�.)
		// �Է� 10 55 3 63 85 61 85 0
		// ��� 0 : 1
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

