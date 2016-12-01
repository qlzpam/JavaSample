import java.util.Scanner;
public class ContactApp2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		int num=0;       //���� ����ó�� ���� ����

		for (;;){
			System.out.println("1.�̸���� 2.��ȭ��ȣ �߰� 3.�ּҵ�� 4.��ȸ 0.����");
			System.out.print("�޴��� �����ϼ���: ");
			int no = sc.nextInt();
			if(no==1){
				// �̸��� �Է¹޾� Contact�� �����մϴ�
				System.out.print("�̸��� �Է��ϼ���: ");
				contact.setName(sc.next());

			} else if (no==2){
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�
				// Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� 
				// -> Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				String number = sc.next();
				System.out.print("Ÿ���� �Է��ϼ���(ȸ��, ���� ��): ");
				String type = sc.next();

				Tel t1 = new Tel(number, type);
				contact.addTel(t1);
				num++;

			} else if (no==3){
				// �ּ������� �Է¹޾� Contact�� �����մϴ�.
				// Address ��ü ���� -> ���Է¹޾� ä��� -> Contact�� setter �̿��ؼ� ����
				System.out.print("�����ȣ�� �Է��ϼ���(�𸣸� 0): ");
				String zipcode = sc.next();
				System.out.print("��or���� �Է��ϼ���: ");
				String sido = sc.next();
				System.out.print("��or���� �Է��ϼ���: ");
				String gugun = sc.next();
				System.out.print("������ �ּҸ��Է��ϼ���1: ");
				String addr1 = sc.next();
				System.out.print("������ �ּҸ��Է��ϼ���2 (������� ��(.) �Է�): ");
				String detail = sc.next();
				Address a1 = new Address(zipcode,sido,gugun,addr1,detail);
				
				contact.setAddress(a1);
				

			} else if (no==4){
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				System.out.printf("�̸�: %s\n", contact.getName());

				Address a1 = contact.getAddress();
				System.out.printf("�ּ�: (%s) %s %s %s %s\n", a1.getZipcode(), a1.getSido(), a1.getGugun(), a1.getAddr1(), a1.getDetail());
				Tel[] t1 = contact.getTels();
				for (int i=0; i<num; i++){
				System.out.printf("����ó%d=> ��ȣ: %s (%s)\n",i ,t1[i].getType() ,t1[i].getNumber());
				}

			} else if (no==0){
				// ���α׷��� �����մϴ�.
				System.out.print("�����մϴ�\n");
				break;
			}
		}
	}
}