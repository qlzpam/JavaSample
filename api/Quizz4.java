import java.util.Scanner;
import java.util.regex.Pattern;
public class Quizz4{
	public static void main(String[] args){
		//���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		//���̵� �ۼ� ��Ģ(���� 6���� �̻�, ����ҹ����ϰ�)

		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� : ");
		String userId =sc.next();
		//���̵� 6���� �̻����� �˻��ϱ�
		if( !( userId.length()>=6) )
			System.out.println("���̵� �ʹ� ª���ϴ�.");

		/*
		// ���̵� ���� �ҹ��ڷθ� ���ִ��� �˻��ϱ� <---- boolean
		if( !userId.toLowerCase().equals(userId) )
			System.out.println("���̵�� �ҹ��ڷθ� ������ֽ��ϴ�.");
		*/

		// ���̵� ���� �ҹ��ڷθ� ���ִ��� �˻��ϱ� <---- boolean
		boolean invalid = false;      // <---- Flag ���� : ���� ������ Ư�� ���¸� �����ϴ� ����
		for(int i = 0; i<userId.length(); i++) { // �ҹ��ڹ��� 97 122
			int tmp = userId.charAt(i);
			if( !(tmp >= 97 && tmp <=122) ) {
				invalid = true;
				System.out.println("���̵�� �ҹ��ڷθ� ������ֽ��ϴ�.");
				break;
			}
		}
		//���� ǥ������ �̿��� ���
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, userId);

		if(!valid){
			System.out.println("��ȿ��������");
		}
	}
}