import java.util.Scanner;
import java.util.Random;

public class Memo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int island = 0; // 0�̸� ����, 1�̸� ���ε�, 0�� �ƴϸ� �����ִ� Ƚ�� ������Ű��
		int count = 0;
		int sum = 0;

		for (;;) {
			System.out.println("-----------------------------------");
			System.out.println("1.�ֻ��� ������			0.����");
			System.out.println("-----------------------------------");
		
			System.out.print("�����ϼ���:");
			int no = sc.nextInt();

			int first = random.nextInt(6)+1;
			int second = random.nextInt(6)+1;


			if (no==1) {
				if(first + second ==7) {
					island = 1;
			}
			} 
			if (island ==1) {
			if (count ==3 || first == second) {
				island=0;
			} count++;
			} else if{
				sum = sum + (first + second);
			} else {
				break;
			}
	}
}

