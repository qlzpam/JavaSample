import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		//����, ����,���� ������ �Է¹޾Ƽ� 
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻�:A, 80�̻�:B, 70�̻�:C, 60�̻�:D, �� �ܴ� F

		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ���:");
		int kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total/3;
		int grade = 0;

				
		if (avg >= 90 ) {
			System.out.print("����: " + total + "\t���: " + avg + "\t���: " + "A");
		}
		else if (avg >= 80) {
			System.out.print("����: " + total + "\t���: " + avg + "\t���: " + "B");
		}
		else if (avg >= 70) {
			System.out.print("����: " + total + "\t���: " + avg + "\t���: " + "C");
		} 
		else if (avg >= 60) {
			System.out.print("����: " + total + "\t���: " + avg + "\t���: " + "D");
		}
		else {
			System.out.print("����: " + total + "\t���: " + avg + "\t���: " + "F");
		}

	}
}