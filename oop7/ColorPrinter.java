public class ColorPrinter extends Printer{
	int dpi;
	public void print(String text){
		System.out.printf("[%s]를 컬러로인쇄합니다\n",text);
	}
	public void chargeInk(){
		System.out.println("잉크를 충전합니다.");
	}
}