public class Sales extends Employee{
	int result;
	int goal;

	// ������ �°� print() �޼ҵ� �������ϱ�.
	public void print(){
		System.out.println("�����ȣ:" + no);
		System.out.println("�̡�����:" + name);
		System.out.println("�� ǥ ��:" + goal);
		System.out.println("�ǡ�����:" + result);
		System.out.println("�� �� ��:" + result/(double)goal);
	}

	public void drawGraph(){
		System.out.print("��ǥ��:");
		for(int i=0;i<goal;i++){
			System.out.print("=");
		}
		System.out.println();

		System.out.print("�ǡ���:");
		for(int i=0;i<result;i++){
			System.out.print("=");
		}
		System.out.println();
	}

}