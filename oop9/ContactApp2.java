import java.util.Scanner;
public class ContactApp2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		int num=0;       //만든 연락처의 갯수 저장

		for (;;){
			System.out.println("1.이름등록 2.전화번호 추가 3.주소등록 4.조회 0.종료");
			System.out.print("메뉴를 선택하세요: ");
			int no = sc.nextInt();
			if(no==1){
				// 이름을 입력받아 Contact에 저장합니다
				System.out.print("이름을 입력하세요: ");
				contact.setName(sc.next());

			} else if (no==2){
				// 전화번호 정보를 입력받아서 Contact에 저장합니다
				// Tel객체 생성 -> 값 입력받아서 채우고 
				// -> Contact의 addTel(Tel tel)에게 Tel 객체 전달해서 배열에 담기
				System.out.print("전화번호를 입력하세요: ");
				String number = sc.next();
				System.out.print("타입을 입력하세요(회사, 가족 등): ");
				String type = sc.next();

				Tel t1 = new Tel(number, type);
				contact.addTel(t1);
				num++;

			} else if (no==3){
				// 주소정보를 입력받아 Contact에 저장합니다.
				// Address 객체 생성 -> 값입력받아 채우고 -> Contact의 setter 이용해서 저장
				System.out.print("우편번호를 입력하세요(모르면 0): ");
				String zipcode = sc.next();
				System.out.print("시or도를 입력하세요: ");
				String sido = sc.next();
				System.out.print("구or군을 입력하세요: ");
				String gugun = sc.next();
				System.out.print("나머지 주소를입력하세요1: ");
				String addr1 = sc.next();
				System.out.print("나머지 주소를입력하세요2 (없을경우 점(.) 입력): ");
				String detail = sc.next();
				Address a1 = new Address(zipcode,sido,gugun,addr1,detail);
				
				contact.setAddress(a1);
				

			} else if (no==4){
				// 연락처 정보를 화면에 표시합니다.
				System.out.printf("이름: %s\n", contact.getName());

				Address a1 = contact.getAddress();
				System.out.printf("주소: (%s) %s %s %s %s\n", a1.getZipcode(), a1.getSido(), a1.getGugun(), a1.getAddr1(), a1.getDetail());
				Tel[] t1 = contact.getTels();
				for (int i=0; i<num; i++){
				System.out.printf("연락처%d=> 번호: %s (%s)\n",i ,t1[i].getType() ,t1[i].getNumber());
				}

			} else if (no==0){
				// 프로그램을 종료합니다.
				System.out.print("종료합니다\n");
				break;
			}
		}
	}
}