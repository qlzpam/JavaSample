public class PrinterApp3{
	public static void main(String[] args){
		Printer p1 = new ColorPrinter();

		p1.feed(); //Printer에 정의된 메소드
		p1.print("내용"); // Printer에 정의, ColorPrinter에 재정의된 메소드

		//객체의 강제 형변환
		ColorPrinter p2 = (ColorPrinter) p1; // p1에서 ColorPrinter 객체쪽으로 옮겨간다
												  // ColorPrinter 객체 참조값이 반환된다.
		p2.dpi = 600;
		p2.chargeInk();
		((ColorPrinter) p1).chargeInk();
	}
}