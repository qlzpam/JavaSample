import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;
		for (;;) {
			System.out.println();
			System.out.println("[1] 입금 [2] 출금 [3] 조회 [0] 종료 ");
			System.out.print("선택선택:");

			int button = sc.nextInt();
			
			if (button==1) {
				System.out.println("입금액: ");
				int deposit = sc.nextInt();
				balance = deposit;
		
			} else if (button==2) {
				System.out.println("출금액: ");
				int moneyout = sc.nextInt(); 
				balance -= moneyout;
				if (balance < 0) {
					System.out.println("잔액이 부족해용");
					break; 
				}
			} else if (button==3) {
				System.out.println("잔액조회: " + balance);
				
			} else if (button==0) {
				System.out.println("♥♥프로그램을 종료합니다♥♥");

				break;
			}
		}
	}
}

/*
	if (selectedNo == 1) {
		System.out.println("입금액: ");
		int amount = sc.nextInt();
		balance += deposit;
		System.out.println("입금이 완료되었습니다!");
	} else if (selectedNo == 2) {
		System.out.println("출금액: ");
		int amount = sc.nextInt(); 

		if (balance >= amount) {
			balacne -= amount;
			System.out.println("출금되었습니다!");
		} else {
			System.out.println("잔액이 부족해용");
		}

	} else if (selectedNo == 3) {
		System.out.println("잔액조회: " + balance);
				
	} else if (selectedNo == 0) {
		System.out.println("♥♥프로그램을 종료합니다♥♥");
			break;
	}
*/
