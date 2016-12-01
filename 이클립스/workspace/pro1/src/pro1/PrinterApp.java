package pro1;

public class PrinterApp {

	public static void main(String[] args) {
		Printer p1 = new ColorPrinter();
		p1.feed();
		p1.print("����");
		
		ColorPrinter p2 = (ColorPrinter)p1;
		p2.dpi = 600;
		p2.chargeInk();
		((ColorPrinter)p1).dpi = 800;
	}

}
