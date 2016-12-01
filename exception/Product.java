public class Product{
	private String name, company;
	private int price;
	private double discountPct;

	public Product(String name, String company, int price, double discountPct){
		this.name = name;
		this.company = company;
		this.price = price;
		this.discountPct = discountPct;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountPct() {
		return discountPct;
	}
	public void setDiscountPct(double discountPct) {
		this.discountPct = discountPct;
	}
	public String toString(){
		return "제품명: " + name + " 제조회사: " + company + " 가격: " +price+ " 할인율: " +discountPct + "\n";
	}
}