public class Quizz2{
	public static void main(String[] args){
		//�ش��ؽ�Ʈ���� <, >�� �����ϰ� �̸��ϸ� ���̰Ը����.
		String text = "<hong@naver.com>,<kim@hanmail.com>,<kang@naver.com>,<yushin@daum.net>";

		String removing = text.replace("<", "");
		String removing2 = removing.replace(">", "");
		String[] result = removing2.split(",");
		for(String a : result){
			System.out.println(a);
		}
	}
}