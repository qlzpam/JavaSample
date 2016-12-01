import java.util.Scanner;
import java.util.regex.Pattern;
public class Quizz4{
	public static void main(String[] args){
		//아이디를 입력받아서 올바른 아이디인지 검사하기
		//아이디 작성 규칙(길이 6글자 이상, 영어소문자일것)

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String userId =sc.next();
		//아이디가 6글자 이상인지 검사하기
		if( !( userId.length()>=6) )
			System.out.println("아이디가 너무 짧습니다.");

		/*
		// 아이디가 영어 소문자로만 되있는지 검사하기 <---- boolean
		if( !userId.toLowerCase().equals(userId) )
			System.out.println("아이디는 소문자로만 만들수있습니다.");
		*/

		// 아이디가 영어 소문자로만 되있는지 검사하기 <---- boolean
		boolean invalid = false;      // <---- Flag 변수 : 로직 수행의 특정 상태를 저장하는 변수
		for(int i = 0; i<userId.length(); i++) { // 소문자범위 97 122
			int tmp = userId.charAt(i);
			if( !(tmp >= 97 && tmp <=122) ) {
				invalid = true;
				System.out.println("아이디는 소문자로만 만들수있습니다.");
				break;
			}
		}
		//정규 표현식을 이용한 방법
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, userId);

		if(!valid){
			System.out.println("유효하지않음");
		}
	}
}