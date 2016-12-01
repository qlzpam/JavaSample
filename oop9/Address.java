public class Address{
	private String zipcode;
	private String sido;
	private String gugun;
	private String addr1;
	private String detail;
	public Address(){}

	public String getZipcode() {
		return zipcode;
	}
	public Address(String zipcode,String sido, String gugun, String addr1, String detail){
		this.zipcode = zipcode;
		this.sido = sido;
		this.gugun = gugun;
		this.addr1 = addr1;
		this.detail = detail;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}