package ��;

public class Account {
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int moneyout(int amount, int pwd) {

		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		if(balance - amount < 100000) {
			System.out.println("���� �������� �����մϴ�. ");
			return 0;
		}

		balance -= amount;
		System.out.println("��� �� �����ܾ�: " + balance);
		return amount; 
	}


	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.owner = "�����";
		a.accountNumber = "1002-341-441570";
		a.password = 4579;
		a.balance = 400000;

		int result = a.moneyout(5000,4579);
		System.out.println(result);
		
	
	}
}


