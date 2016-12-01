import java.util.Scanner;

public class IfDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원)");
		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.println("음료를 고르세요:");
		int no = sc.nextInt();
				
		if (no == 1){
			System.out.println("커피를 받아가세요" + "\n거스름돈: " + (money - 1500) + "원");
		} 
		if (no ==2) {
			System.out.println("과일쥬스를 받아가세요" + "\n거스름돈: " + (money - 2000) + "원");
		}
		if (no ==3) {
			System.out.println("이온음료를 받아가세요" + "\n거스름돈: " + (money - 1000) + "원");

		// 거스름돈 처리 

		}
	}
}