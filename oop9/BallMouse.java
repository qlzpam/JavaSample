public class BallMouse implements Mouse, Cleanable{

	// Mouse �������̽��� ����� �߻�޼ҵ� ����
	public void wheel(){
		System.out.println("���ۺ���");
	}
	public void click(){
		System.out.println("Ŭ��Ŭ��");
	}
	public void move(){
		System.out.println("��������");
	}

	// Cleanable �������̽��� ���ǵ� �߻�޼ҵ� ����
	public void clean(){
		System.out.println("Ball�� ���� ���� �Ϸ�");
	}

}