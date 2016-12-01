import java.util.Scanner;

public class IfDemo9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원)");
		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.println("음료를 고르세요:");
		int no = sc.nextInt();
				
		int returnCoin = 0;

		if (no == 1){
			System.out.println("커피를 받아가세요");
			returnCoin = money - 1500;
		} else if (no ==2) {
			System.out.println("과일쥬스를 받아가세요");
			returnCoin = money - 2000;
		} else if (no==3) {
			System.out.println("이온음료를 받아가세요");
			returnCoin = money - 1000;	
		} else {
			System.out.println("잘못된 번호입니다.");
		}
		System.out.println("거스름돈: " + returnCoin + "원");

		int return1 = returnCoin/5000;
		int return2 = (returnCoin - (5000*return1))/1000;
		int return3 = (returnCoin - (5000*return1) - (1000*return2))/500;
		int return4 = (returnCoin - (5000*return1) - (1000*return2) - (500*return3))/ 100;

		if (returnCoin >= 5000) {
			System.out.print("5000원: " + return1 + "\t1000원: " + return2 + "\t500원: " + return3 + "\t100원: " + return4 + "\n");
		}
		else if (1000 <=returnCoin && returnCoin <5000) {
			System.out.print("1000원: " + return2 + "\t500원: " + return3 + "\t100원: " + return4 + "\n");
		}
		else if (1000 > returnCoin && returnCoin >=500) {
			System.out.print( "500원: " + return3 + "\t100원: " + return4 + "\n");
		}
		else {
			System.out.print("100원: " + return4 + "\n");
		}

	}
}