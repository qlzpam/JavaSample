public class Quizz1 {
	public static void main(String[] arsg) {
		 
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=(6-a); b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

		for (int a=1; a<=5; a++) {
			for (int b=1; b<a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}