public class Quizz2{
	public static void main(String[] args){
		//해당텍스트에서 <, >를 제거하고 이메일만 보이게만들기.
		String text = "<hong@naver.com>,<kim@hanmail.com>,<kang@naver.com>,<yushin@daum.net>";

		String removing = text.replace("<", "");
		String removing2 = removing.replace(">", "");
		String[] result = removing2.split(",");
		for(String a : result){
			System.out.println(a);
		}
	}
}