public class PrinterApp3{
	public static void main(String[] args){
		Printer p1 = new ColorPrinter();

		p1.feed(); //Printer�� ���ǵ� �޼ҵ�
		p1.print("����"); // Printer�� ����, ColorPrinter�� �����ǵ� �޼ҵ�

		//��ü�� ���� ����ȯ
		ColorPrinter p2 = (ColorPrinter) p1; // p1���� ColorPrinter ��ü������ �Űܰ���
												  // ColorPrinter ��ü �������� ��ȯ�ȴ�.
		p2.dpi = 600;
		p2.chargeInk();
		((ColorPrinter) p1).chargeInk();
	}
}