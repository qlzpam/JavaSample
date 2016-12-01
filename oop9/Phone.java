public class Phone{
	private String tel;
	private String company;
	public Phone(){
		System.out.println("Phone의 기본생성자 실행되었습니다.");
	}
	public Phone(String tel, String compnay){
		System.out.println("Phone의 생성자(String, String) 실행되었습니다.");
		this.tel = tel;
		this.company = company;
	}
	public String getTel(){
		return tel;
	}
	public String getCompany(){
		return company;
	}
}