import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;
		for (;;) {
			System.out.println();
			System.out.println("[1] �Ա� [2] ��� [3] ��ȸ [0] ���� ");
			System.out.print("���ü���:");

			int button = sc.nextInt();
			
			if (button==1) {
				System.out.println("�Աݾ�: ");
				int deposit = sc.nextInt();
				balance = deposit;
		
			} else if (button==2) {
				System.out.println("��ݾ�: ");
				int moneyout = sc.nextInt(); 
				balance -= moneyout;
				if (balance < 0) {
					System.out.println("�ܾ��� �����ؿ�");
					break; 
				}
			} else if (button==3) {
				System.out.println("�ܾ���ȸ: " + balance);
				
			} else if (button==0) {
				System.out.println("�������α׷��� �����մϴ٢���");

				break;
			}
		}
	}
}

/*
	if (selectedNo == 1) {
		System.out.println("�Աݾ�: ");
		int amount = sc.nextInt();
		balance += deposit;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�!");
	} else if (selectedNo == 2) {
		System.out.println("��ݾ�: ");
		int amount = sc.nextInt(); 

		if (balance >= amount) {
			balacne -= amount;
			System.out.println("��ݵǾ����ϴ�!");
		} else {
			System.out.println("�ܾ��� �����ؿ�");
		}

	} else if (selectedNo == 3) {
		System.out.println("�ܾ���ȸ: " + balance);
				
	} else if (selectedNo == 0) {
		System.out.println("�������α׷��� �����մϴ٢���");
			break;
	}
*/
