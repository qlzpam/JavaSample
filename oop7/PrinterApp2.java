public class PrinterApp2{
	public static void main(String[] args){
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();
		PhotoPrinter p4 = (PhotoPrinter) p3;

		//�Ʒ��� ���๮�� ��� ������� �ٸ���.
		//������ print �޼ҵ带 ����������
		//������ �ڽ� Ŭ�������� �������� print �޼ҵ尡 ����ȴ�.
		p1.print("��������");
		p2.print("������Ȳ");
		p3.print("�������");
		p4.edit();
	}
}