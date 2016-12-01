public class PrinterApp2{
	public static void main(String[] args){
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();
		PhotoPrinter p4 = (PhotoPrinter) p3;

		//아래의 수행문은 모두 결과값이 다르다.
		//이유는 print 메소드를 실행했지만
		//각각의 자식 클래스에서 재정의한 print 메소드가 실행된다.
		p1.print("공지사항");
		p2.print("매출현황");
		p3.print("여행사진");
		p4.edit();
	}
}