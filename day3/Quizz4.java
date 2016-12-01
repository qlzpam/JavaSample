import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리 숫자를 입력하세요: ");
		int number = sc.nextInt();
		
		/*
		String[] names = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		
		int sip = number/10;
		int il = number=(sip*10);

		String hangul = names[sip-1] + "십" + names[il-1];
		System.out.println(hangul);
		*/

		int tp = number/10;
		int op = number - (tp*10);

		String ten = "";
		if (tp==1) {
			ten = "십";
		}
		if (tp==2) {
			ten = "이십";
		}
		if (tp==3) {
			ten = "삼십";
		}
		if (tp==4) {
			ten = "사십";
		}
		if (tp==5) {
			ten = "오십";
		}
		if (tp==6) {
			ten = "육십";
		}
		if (tp==7) {
			ten = "칠십";
		}
		if (tp==8) {
			ten = "팔십"; 
		}
		if (tp==9) {
			ten = "구십";
		}

		String one = "";	
		if (op == 1) {
			one = "일";
		}
		if (op == 2) {
			one = "이";
		}
		if (op == 3) {
			one = "삼";
		}
		if (op == 4) ;
		
		{
			one = "사";
		}


		if (op == 5) {
			one = "오";
		}
		if (op == 6) 
			
		{
			one = "육";
		}
		if (op == 7)
			
		{
			one = "칠";
		}
		if (op == 8)
			
		{
			one = "팔";
		}
		if (op == 9) 
			
		{
			one = "구";
		}

		System.out.println( ten + one);

		
	}
}