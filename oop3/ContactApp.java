import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ� 
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		// ���� 3�� �Է��� ���� ����
		for (;;) {
			System.out.println("1:��� 2:��ȸ 0:����");

			System.out.println("�޴� ��ȣ�� �Է��ϼ���");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ� 
				// currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ� currentPosition�� ���� 1 ������Ų��. 

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�- ����� ���� ����ϸ� ���� 
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���

			}
		}
	}
}