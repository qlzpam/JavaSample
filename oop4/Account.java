/* banking program
1. ���� ��� ��� 
    -�̸��� ��й�ȣ, �����Աݾ��� �Է¹޾Ƽ� ���¸� �����Ѵ�.
	-���¹�ȣ�� 111-111-1111�� ����.
2. ��ȸ��� 
	-�̸�, ���¹�ȣ, �ܰ� ǥ�����ش�
3. ��й�ȣ ������
	-���� ��й�ȣ�� �� ��й�ȣ�� �Է¹޾Ƽ� ��й�ȣ�� �����Ѵ�.
4. �Ա� ���
	-�Աݾ��� �Է¹޾Ƽ� �ܾ��� ������Ų��.
5. ��� ���
	-��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� �ܾ��� ���ҽ�Ų��.
6. ����
	-���α׷��� �����Ѵ�.
*/
import java.util.*;
public class Account{
	private String name;
	private int password;
	private int balance;
	private String accountNum;

	Scanner sc = new Scanner(System.in);

	public Account(){
		accountNum = "111-111-1111";
	}

	public int showMenu(){
		System.out.println("===========================");
		System.out.println("1.���� ���");
		System.out.println("2.���� ��ȸ");
		System.out.println("3.���� ��й�ȣ ����");
		System.out.println("4.���� �Ա�");
		System.out.println("5.���� ���");
		System.out.println("6.����");
		System.out.println("===========================");
		System.out.print("�޴��� �����ϼ���: ");
		return sc.nextInt();
	}
	public void addAccount(){
		System.out.println("���¸� ����ϰڽ��ϴ�");
		System.out.print("������ �����ּ���: ");
		name = sc.next();
		System.out.print("��й�ȣ�� �����ּ���: ");
		password = sc.nextInt();
		System.out.print("�����Աݾ��� �����ּ���: ");
		balance = sc.nextInt();
		System.out.println("���°� ���������� ��ϵǾ����ϴ�.");
	}
	public void accInfo(){
		System.out.println("===== ��ϵ� �������� =====");
		System.out.printf("����: %s\n",name);
		System.out.printf("���¹�ȣ: %s\n",accountNum);
		System.out.printf("�ܾ�: %s\n",balance);
	}
	public void passChange(){
		System.out.print("���� ��й�ȣ: ");
		int pass1 = sc.nextInt();
		System.out.print("�ٲٽ� ��й�ȣ: ");
		int pass2 = sc.nextInt();
		if(password!=pass1){
			System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return;
		}
		password=pass2;
	}
	public void deposit(){
		System.out.print("�Ա��Ͻ� �ݾ�: ");
		balance += sc.nextInt();
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
		System.out.println("�Ա��� �ܾ��� [" +balance+"]�� �Դϴ�.");
	}
	public void withdraw(){
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		if(password!=sc.nextInt()){
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			return;
		}
		System.out.print("����Ͻ� �ݾ�: ");
		int howMuch = sc.nextInt();
		if(howMuch>balance){
			System.out.println("���� �ܾ׺��� �������� ����� �� �����ϴ�.");
			System.out.println("���� �ܾ�: "+balance);
			return;
		}
		balance -= sc.nextInt();
		System.out.println("����� �Ϸ�Ǿ����ϴ�");
		System.out.println("����� �ܾ��� [" +balance+"]�� �Դϴ�.");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(int pass){
		this.password = pass;
	}
	public int getPassword(){
		return password;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public int getBalance(){
		return balance;
	}
}