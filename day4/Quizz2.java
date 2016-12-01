public class Quizz2 {
	public static void main(String[] args) {
		// x,y 구하기
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (4*x + 5*y == 60) {
					System.out.printf("[%2d, %2d]\n", x,y);
				}
			}
		}
	}
}
//printd printf-알파벳 prints-실수