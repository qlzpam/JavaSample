import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기 
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		// 연속 3개 입력을 위한 포문
		for (;;) {
			System.out.println("1:등록 2:조회 0:종료");

			System.out.println("메뉴 번호를 입력하세요");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기 
				// currentPosition이 가르키는 위치에 Contact를 저장하고 currentPosition의 값을 1 증가시킨다. 

			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기- 인헨스드 포문 사용하면 에러 
				// 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복해서 출력

			}
		}
	}
}