public class PhotoPrinter extends Printer{
	int size;

	//�θ�Ŭ������ �޼ҵ� ������
	public void print(String data){
		System.out.printf("[%s]�� ������ȭ���� �μ��մϴ�.\n",data);
	}

	public void edit(){
		System.out.println("������ �����մϴ�");
	}

}