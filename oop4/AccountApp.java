public class AccountApp{
	public static void main(String[] args){
		Account a1 = new Account();
		for(;;){
			 int selNum = a1.showMenu();
			 if (selNum==1){ //���µ��
				 if(a1.getPassword()!=0){
					 System.out.println("�̹� ���°� ��ϵǾ��ֽ��ϴ�.");
					 continue;
				 }
				 a1.addAccount();
			 } else if (selNum==2){ //������ȸ
				 a1.accInfo();
			 } else if (selNum==3){ //��й�ȣ ����
				 a1.passChange();
			 } else if (selNum==4){ //�Ա�
				 a1.deposit();
			 } else if (selNum==5){ //���
				 a1.withdraw();
			 } else if (selNum==6){ //����
				 System.out.println("�����մϴ�.");
				 break;
			 }
		}
	}
}