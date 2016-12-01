import java.util.Scanner;
import java.util.Random;

public class Memo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int island = 0; // 0이면 자유, 1이면 무인도, 0이 아니면 남아있는 횟수 증가시키기
		int count = 0;
		int sum = 0;

		for (;;) {
			System.out.println("-----------------------------------");
			System.out.println("1.주사위 굴리기			0.종료");
			System.out.println("-----------------------------------");
		
			System.out.print("선택하세요:");
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

