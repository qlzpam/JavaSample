import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서 
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - h*100) /10;
		int one = number - h*100 - d*10;
		System.out.print("100의 자리수: " + h  +"\t10의 자리수: " + d 
						+ "\t1의 자리수: " + one +"\n");
		

	}
}