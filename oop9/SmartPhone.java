public class SmartPhone extends Phone{
	private String ip;
	public SmartPhone(){
		this.ip = ip;
		System.out.println("SmartPhone�� �⺻������ ����Ǿ����ϴ�.");
	}

	public SmartPhone(String tel, String company, String ip){
		super(tel,company);
		System.out.println("SmartPhone(Str, Str, Str) ������ ����Ǿ����ϴ�.");
	}

	public String getIp(){
		return ip;
	}

	public void setIp(String ip){
		this.ip = ip;
	}
}