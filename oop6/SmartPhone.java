public class SmartPhone extends Phone {
	String ip,email;
	public void web(String url){
		System.out.printf("[%s] ���������� ǥ���մϴ�.\n", url);
	}
	public void sendEmail(String to, String title, String text){
		System.out.printf("[%s]���� [%s]�� [%s] [%s]�� �����ϴ�.\n",email, to, title, text);
	}
}