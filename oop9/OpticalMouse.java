public class OpticalMouse implements Mouse, Lightable{
	// Mouse �������̽��� ����� �߻�޼ҵ� ����
	public void wheel(){
		System.out.println("������¦�̸� ���ۺ���");
	}
	public void click(){
		System.out.println("���� ��¦�̸� Ŭ��Ŭ��");
	}
	public void move(){
		System.out.println("������¦�̸� ��������");
	}

	// Lightable �������̽��� ���ǵ� �߻�޼ҵ� ����
	public void light(){
		System.out.println("��¦~~ ��¦~~");
	}

	// Cleanable �������̽��� ���ǵ� �߻�޼ҵ� ����
	//public void clean(){
	//	System.out.println("LED �߽ź� û�ҿϷ�");
	//}
}