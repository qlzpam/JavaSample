public class B{
	int x;
	static int y;
	public void m1(){
		System.out.println(x);
		System.out.println(y);
	}
	// non static ���� ���Ұ�, this ���Ұ�(�����ڰ� �������)
	public static void m2(){   // static �� ������ ��ü�� �������ʰ� ���డ����
		// System.out.println(x); => ��ü�� �ȸ�������� x�� ���⶧���� �����߻�
		System.out.println(y);
	}
	public void m3(){
		m1();
		m2();
	}
	public static void m4(){
		// m1(); => ��ü�� �ȸ�������� m1()�� ���⶧���� �����߻�
		m2();
	}
}