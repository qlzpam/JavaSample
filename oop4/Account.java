/* banking program
1. 계좌 등록 기능 
    -이름과 비밀번호, 최초입금액을 입력받아서 계좌를 생성한다.
	-계좌번호는 111-111-1111로 세팅.
2. 조회기능 
	-이름, 계좌번호, 잔고를 표시해준다
3. 비밀번호 변경기능
	-예전 비밀번호와 새 비밀번호를 입력받아서 비밀번호를 변경한다.
4. 입금 기능
	-입금액을 입력받아서 잔액을 증가시킨다.
5. 출금 기능
	-출금액과 비밀번호를 입력받아서 잔액을 감소시킨다.
6. 종료
	-프로그램을 종료한다.
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
		System.out.println("1.계좌 등록");
		System.out.println("2.계좌 조회");
		System.out.println("3.계좌 비밀번호 변경");
		System.out.println("4.계좌 입금");
		System.out.println("5.계좌 출금");
		System.out.println("6.종료");
		System.out.println("===========================");
		System.out.print("메뉴를 선택하세요: ");
		return sc.nextInt();
	}
	public void addAccount(){
		System.out.println("계좌를 등록하겠습니다");
		System.out.print("성함을 적어주세요: ");
		name = sc.next();
		System.out.print("비밀번호를 적어주세요: ");
		password = sc.nextInt();
		System.out.print("최초입금액을 적어주세요: ");
		balance = sc.nextInt();
		System.out.println("계좌가 성공적으로 등록되었습니다.");
	}
	public void accInfo(){
		System.out.println("===== 등록된 계좌정보 =====");
		System.out.printf("성함: %s\n",name);
		System.out.printf("계좌번호: %s\n",accountNum);
		System.out.printf("잔액: %s\n",balance);
	}
	public void passChange(){
		System.out.print("이전 비밀번호: ");
		int pass1 = sc.nextInt();
		System.out.print("바꾸실 비밀번호: ");
		int pass2 = sc.nextInt();
		if(password!=pass1){
			System.out.println("이전 비밀번호가 일치하지 않습니다.");
			return;
		}
		password=pass2;
	}
	public void deposit(){
		System.out.print("입금하실 금액: ");
		balance += sc.nextInt();
		System.out.println("입금이 완료되었습니다");
		System.out.println("입금후 잔액은 [" +balance+"]원 입니다.");
	}
	public void withdraw(){
		System.out.print("비밀번호를 입력하세요: ");
		if(password!=sc.nextInt()){
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		System.out.print("출금하실 금액: ");
		int howMuch = sc.nextInt();
		if(howMuch>balance){
			System.out.println("현재 잔액보다 많은돈을 출금할 수 없습니다.");
			System.out.println("현재 잔액: "+balance);
			return;
		}
		balance -= sc.nextInt();
		System.out.println("출금이 완료되었습니다");
		System.out.println("출금후 잔액은 [" +balance+"]원 입니다.");
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