import java.util.Scanner;

public class IfDemo9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��)");
		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.println("���Ḧ ������:");
		int no = sc.nextInt();
				
		int returnCoin = 0;

		if (no == 1){
			System.out.println("Ŀ�Ǹ� �޾ư�����");
			returnCoin = money - 1500;
		} else if (no ==2) {
			System.out.println("�����꽺�� �޾ư�����");
			returnCoin = money - 2000;
		} else if (no==3) {
			System.out.println("�̿����Ḧ �޾ư�����");
			returnCoin = money - 1000;	
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		System.out.println("�Ž�����: " + returnCoin + "��");

		int return1 = returnCoin/5000;
		int return2 = (returnCoin - (5000*return1))/1000;
		int return3 = (returnCoin - (5000*return1) - (1000*return2))/500;
		int return4 = (returnCoin - (5000*return1) - (1000*return2) - (500*return3))/ 100;

		if (returnCoin >= 5000) {
			System.out.print("5000��: " + return1 + "\t1000��: " + return2 + "\t500��: " + return3 + "\t100��: " + return4 + "\n");
		}
		else if (1000 <=returnCoin && returnCoin <5000) {
			System.out.print("1000��: " + return2 + "\t500��: " + return3 + "\t100��: " + return4 + "\n");
		}
		else if (1000 > returnCoin && returnCoin >=500) {
			System.out.print( "500��: " + return3 + "\t100��: " + return4 + "\n");
		}
		else {
			System.out.print("100��: " + return4 + "\n");
		}

	}
}