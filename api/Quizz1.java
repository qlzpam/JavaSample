import java.util.Scanner;
public class Quizz1{
	public static void main(String[] args){
		// 이메일을 입력받아서 이메일에 포함된 아이디 부분만 출력하기
		// 예) eungsulee@hanmail.net -----> eungsulee
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요: ");
		String userEmail = sc.next();
		String result = userEmail.substring(0, userEmail.indexOf("@"));
	
		System.out.println(result);
	}
}