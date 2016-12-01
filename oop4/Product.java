public class Product {
	private int no;
	private String name;
	private String maker;
	private String category;
	private int price;
	private double discountRate;
	private boolean isFree;

	public Product(){}  // == this()

	public Product(int no, String name, String maker, String category, int price){
		//this.no = no;
		//this.name=name;
		//this.maker=maker;
		//this.category = category;
		//this.price = price;
		this(no, name, maker, category, price, 0.1, false); 
		System.out.println("Product(int, string, string, string, int) is running");
		// ㄴ모든매개변수를 가진 생성자를 호출하여 뒤에두개값은 넣지않음. (효과: 코드가 간단해짐)
	}

	// this(int, String, String, String, int, double, boolean)
	public Product(int no, String name, String maker, String category, int price, double discountRate, boolean isFree){
		this.no = no;
		this.name=name;
		this.maker=maker;
		this.category = category;
		this.price = price;
		this.discountRate=discountRate;
		this.isFree=isFree;
		System.out.println("Product(int, string, string, string, int, double, boolean) is running");
	}

	public void displayInfo(){
		System.out.println("번호: " +no);
		System.out.println("이름: " +name);
		System.out.println("제조사: " +maker);
		System.out.println("종류: " +category);
		System.out.println("가격: " +price);
		System.out.println("할인율: " +discountRate);
		System.out.println("무료여부: " +isFree);
	}
}