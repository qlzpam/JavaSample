import java.util.Scanner;
public class Quizz1{
	public static void main(String[] args){
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵� �κи� ����ϱ�
		// ��) eungsulee@hanmail.net -----> eungsulee
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸����� �Է��ϼ���: ");
		String userEmail = sc.next();
		String result = userEmail.substring(0, userEmail.indexOf("@"));
	
		System.out.println(result);
	}
}