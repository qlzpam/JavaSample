import java.util.*;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random ();

		// ������ ���� 3���� ������ �迭
		int[] numbers = new int[3];
		int position = 0;
		
		for (;;) {	// ���ѷ���
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i =0; i<position; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) {
				numbers[position] = number;
				position++;
			}
			
			if (position == 3) {
				break;
			}
		}
		System.out.println(Arrays.toString(numbers));
		int answerCount = 0; //����� Ƚ���� ���� �ۿ� 

		for (int i=1; i<11; i++ ) {
			int strike = 0;
			int ball = 0;
			//����ڰ� �Է��� ���� ������ �迭
			int[] answer = new int[3];

			 System.out.print("ù��° ���ڸ� �Է��ϼ���.");
			 answer[0] = sc.nextInt();
			 System.out.print("�ι�° ���ڸ� �Է��ϼ���.");
			 answer[1] = sc.nextInt();
			 System.out.print("����° ���ڸ� �Է��ϼ���.");
			 answer[2] = sc.nextInt();
			
			for (int a=0; a<3; a++) {
				for (int b=0; b<3; b++) {
					if (numbers[a] == answer[b]) {
						if ( a==b ) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}

			System.out.printf("s:%d b:%d\n", strike, ball);

			if (strike ==3) {
				break;
			}
			answerCount++;
			System.out.println(10-answerCount + "ȸ ���ҽ��ϴ�.");
		}
				
		System.out.println("����");

	}
}