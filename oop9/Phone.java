public class Phone{
	private String tel;
	private String company;
	public Phone(){
		System.out.println("Phone�� �⺻������ ����Ǿ����ϴ�.");
	}
	public Phone(String tel, String compnay){
		System.out.println("Phone�� ������(String, String) ����Ǿ����ϴ�.");
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