import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ� 
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭 ����� 
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ� 
		
		System.out.print(">>���� ������ �� �л����� ���� �Է��Ͻÿ� >>");
		int size = sc.nextInt();			// �л��� == �迭�� ũ�� // 1�� ����
		int[] scores = new int[size];	// 2�� �迭 ����


		// �迭�� ���������� �����ϱ�
		for (int i=0; i<size; i++) {		// �л��� �迭����
			System.out.print("���� ������ �Է��Ͻÿ�!");
			int score = sc.nextInt();		// ������ �Է¹���

			sores[i] = score;
		}

		// ������ ��� ����ϱ�
		int sum = 0;
		int avg = 0;
		for (int score : scores) {
				total += score;
		}
		avg = total/size;

		System.out.printf("����:%d	���:%d\n", total, avg);


		/*
		for (int a=0; a<size; a++) {
			sum += students[a];
			avg = sum/size;
			
		}
		System.out.println( sum + " " + avg);
		*/

		}
	}



