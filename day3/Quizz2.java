import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ� 
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - h*100) /10;
		int one = number - h*100 - d*10;
		System.out.print("100�� �ڸ���: " + h  +"\t10�� �ڸ���: " + d 
						+ "\t1�� �ڸ���: " + one +"\n");
		

	}
}