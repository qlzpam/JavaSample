public class App{
	public static void main(String[] args){
		// staic ������ ��ü ��������
		// Ŭ������.���������� ��� ���� ex) a.y
		System.out.println(A.y);

		//���� ���� y �� �� �Ҵ��ϱ�
		//AŬ������ ����ؼ� ���� ��簴ü��
		//����(static) ���� y ���� �����Ѵ�.
		A.y = 100;

		A a1 = new A();
		//a1.x = 10;
		System.out.println(a1.y +" "+ a1.x); // ��ü.y�� y ���� ��µǱ�� ������ y�� ��������� �����ϱ⽱��.

		A a2 = new A();
		//a2.x = 20;
		System.out.println(A.y +" "+ a2.x);

		A a3 = new A();
		//a3.x = 30;
		System.out.println(A.y +" "+ a3.x);
	}
}