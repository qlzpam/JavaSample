import java.util.Scanner;

public class IfDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��)");
		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.println("���Ḧ ������:");
		int no = sc.nextInt();
				
		if (no == 1){
			System.out.println("Ŀ�Ǹ� �޾ư�����" + "\n�Ž�����: " + (money - 1500) + "��");
		} 
		if (no ==2) {
			System.out.println("�����꽺�� �޾ư�����" + "\n�Ž�����: " + (money - 2000) + "��");
		}
		if (no ==3) {
			System.out.println("�̿����Ḧ �޾ư�����" + "\n�Ž�����: " + (money - 1000) + "��");

		// �Ž����� ó�� 

		}
	}
}