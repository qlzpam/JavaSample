public class ColorPrinter extends Printer{
	int dpi;
	public void print(String text){
		System.out.printf("[%s]�� �÷����μ��մϴ�\n",text);
	}
	public void chargeInk(){
		System.out.println("��ũ�� �����մϴ�.");
	}
}