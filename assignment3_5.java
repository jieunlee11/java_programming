import java.util.Scanner;

public class assignment3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ������ϰ� 18�� �̻��� �����̶������
		// ����('M','F')�� ���̸� �Է¹޾� "MAN"(���γ���), "WOMAN"(���ο���),"BOY"(�̼��Ⳳ��),
		// "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� ��: F 15 / ��� ��: GIRL
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� ('M' Ȥ�� 'F')? :");
		String gender = in.nextLine();
		
		System.out.println("���̸� �Է��Ͻÿ� : ");
		int age = in.nextInt();
		
		
		if((gender.equals("M")) && (age >= 18)) {
			System.out.println("MAN");
		}
		else if ((gender.equals("M")) && (age < 18)) {
			System.out.println("BOY");
		}
		else if ((gender.equals("F")) && (age >= 18)) {
			System.out.println("WOMAN");
		}
		else if ((gender.equals("F")) && (age < 18)) {
			System.out.println("GIRL");
		}
		
		in.close();
		
		
	}

}
