public class SmartPhone extends Phone {
	String ip,email;
	public void web(String url){
		System.out.printf("[%s] 웹페이지를 표시합니다.\n", url);
	}
	public void sendEmail(String to, String title, String text){
		System.out.printf("[%s]에서 [%s]로 [%s] [%s]를 보냅니다.\n",email, to, title, text);
	}
}