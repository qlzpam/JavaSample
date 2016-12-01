public class AccountApp{
	public static void main(String[] args){
		Account a1 = new Account();
		for(;;){
			 int selNum = a1.showMenu();
			 if (selNum==1){ //계좌등록
				 if(a1.getPassword()!=0){
					 System.out.println("이미 계좌가 등록되어있습니다.");
					 continue;
				 }
				 a1.addAccount();
			 } else if (selNum==2){ //계좌조회
				 a1.accInfo();
			 } else if (selNum==3){ //비밀번호 변경
				 a1.passChange();
			 } else if (selNum==4){ //입금
				 a1.deposit();
			 } else if (selNum==5){ //출금
				 a1.withdraw();
			 } else if (selNum==6){ //종료
				 System.out.println("종료합니다.");
				 break;
			 }
		}
	}
}