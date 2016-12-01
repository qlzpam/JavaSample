public class ForDemo3 {
	public static void main(String[] args) {
		// 1 ~ 10까지의 합을 계산하기
		/*
		int total = 0;
		total = total + 1;  1 + 1 =2
		total = total + 2;	2+2=4
		total = total + 3;	4+3=7
		total = total + 4;	7+4=11
		total = total + 5;  
		*/

		int total = 0;

		for (int a=1; a<=10; a++) {
			total += a;
		}
			System.out.println("합계: " + total);
	}
}