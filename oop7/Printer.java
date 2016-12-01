public class Printer{
	String telNumber;
	public void print(String text){
		System.out.printf("[%s]를 흑백으로 인쇄합니다.\n", text);
	}

	public void feed() {
		System.out.printf("종이를 공급합니다\n");
	}
}