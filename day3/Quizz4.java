import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� ���ڸ� �Է��ϼ���: ");
		int number = sc.nextInt();
		
		/*
		String[] names = {"��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
		
		int sip = number/10;
		int il = number=(sip*10);

		String hangul = names[sip-1] + "��" + names[il-1];
		System.out.println(hangul);
		*/

		int tp = number/10;
		int op = number - (tp*10);

		String ten = "";
		if (tp==1) {
			ten = "��";
		}
		if (tp==2) {
			ten = "�̽�";
		}
		if (tp==3) {
			ten = "���";
		}
		if (tp==4) {
			ten = "���";
		}
		if (tp==5) {
			ten = "����";
		}
		if (tp==6) {
			ten = "����";
		}
		if (tp==7) {
			ten = "ĥ��";
		}
		if (tp==8) {
			ten = "�Ƚ�"; 
		}
		if (tp==9) {
			ten = "����";
		}

		String one = "";	
		if (op == 1) {
			one = "��";
		}
		if (op == 2) {
			one = "��";
		}
		if (op == 3) {
			one = "��";
		}
		if (op == 4) ;
		
		{
			one = "��";
		}


		if (op == 5) {
			one = "��";
		}
		if (op == 6) 
			
		{
			one = "��";
		}
		if (op == 7)
			
		{
			one = "ĥ";
		}
		if (op == 8)
			
		{
			one = "��";
		}
		if (op == 9) 
			
		{
			one = "��";
		}

		System.out.println( ten + one);

		
	}
}