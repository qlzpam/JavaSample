import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
				
		boolean island = false; // 0�̸� ����, 1�̸� ���ε�, 0�� �ƴϸ� �����ִ� Ƚ�� ������Ű��
		int count = 3;
		int distance = 0;

		for (;;) {
			System.out.println("-----------------------------------");
			System.out.println("1.�ֻ��� ������			0.����");
			System.out.println("-----------------------------------");
		
			System.out.print("�����ϼ���:");
			int no = sc.nextInt();

			if (no ==1) {
			int first = random.nextInt(6)+1;
			int second = random.nextInt(6)+1;

			System.out.printf("(%d,%d)\n", first, second);

				if (!island) {						//���ε��� �������� �ʴ� ��� 
					if (first + second == 7) {		// ���ֻ����� ���� 7�� ���
						island = true;				// ���ε���
						count = 3;					// Ż����� 3ȸ ����
						System.out.println("@@@���ε��� ����@@@");
					} else {						// �� �ֻ����� ���� 7�� �ƴ� ��� 
						distance += first + second; // �̵��Ÿ� ���� 
						System.out.println("�̵��Ÿ�" + distance + "ĭ");

						if (distance > 100) {		// �̵��Ÿ��� 100�� ������ 
							System.out.println("### ������ ����###");
							break;
						}
					}
				
				} else {							// ���ε��� �����ִ� ��� 
					if (first == second) {			// �ֻ��� ���ڰ� ���� ��� 
						island = false;				// ���ε� Ż��
					} else {						// �ֻ��� ���ڰ� �ٸ� ���
						count--;					// ���� Ƚ���� 1 ���ҽ�Ų��. 	
						
						if (count == 0) {			// ���� Ƚ���� 0�̸�
							island = false;			// ���ε� Ż��
							System.out.println("### 3ȸ�� ��� ���ε� Ż�� ###");
						} else {
							System.out.println("Ż����� ["+count+"] ȸ ���ҽ��ϴ�.");
						}
					}
				}
	
			} else if (no == 0) {
				break;
			}
		}
		System.out.println("���α׷��� �����ϼ���.");
	}
}
