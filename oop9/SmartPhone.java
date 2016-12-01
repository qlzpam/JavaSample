public class SmartPhone extends Phone{
	private String ip;
	public SmartPhone(){
		this.ip = ip;
		System.out.println("SmartPhone의 기본생성자 실행되었습니다.");
	}

	public SmartPhone(String tel, String company, String ip){
		super(tel,company);
		System.out.println("SmartPhone(Str, Str, Str) 생성자 실행되었습니다.");
	}

	public String getIp(){
		return ip;
	}

	public void setIp(String ip){
		this.ip = ip;
	}
}