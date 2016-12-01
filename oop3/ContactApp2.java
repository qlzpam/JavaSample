import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();


		for (;;) {
			System.out.println("1:등록 2:조회 0:종료");

			System.out.println("메뉴 번호를 입력하세요");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// mgr의 addContact(Contact contact) 메소드에 등록학 Contact 객체 전달하기 
				publi void addContact
				

			} else if (menuNo == 2) {
				// mgr의 displayContact()를 실행시키기

			
			} else if (menuNo ==3) {
				break;
			}
		}
	}
}








	}	
}