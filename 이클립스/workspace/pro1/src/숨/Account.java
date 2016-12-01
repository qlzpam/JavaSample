package 숨;

public class Account {
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int moneyout(int amount, int pwd) {

		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		if(balance - amount < 100000) {
			System.out.println("최저 적립액이 부족합니다. ");
			return 0;
		}

		balance -= amount;
		System.out.println("출금 후 현재잔액: " + balance);
		return amount; 
	}


	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.owner = "박재범";
		a.accountNumber = "1002-341-441570";
		a.password = 4579;
		a.balance = 400000;

		int result = a.moneyout(5000,4579);
		System.out.println(result);
		
	
	}
}


