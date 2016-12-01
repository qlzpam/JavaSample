public class CApp{
	public static void main(String[] args) throws Exception{
		Class.forName("C"); // Class.forName("클래스이름") 해당 클래스를 메모리에 불러온다.

		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
	}
}