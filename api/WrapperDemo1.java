public class WrapperDemo1{
	public static void main(String[] args){
		// ���� 23�� �������ִ� Integer ��ü�� �����ϴ� a
		Integer a = new Integer(12345); // <=== �̰����� �ڽ�(boxing)�̶���Ѵ�.
		// Integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ� : int intValue()
		int x = a.intValue(); // <=== �̰����� ��ڽ�(unboxing)�̶���Ѵ�.
		double y = a.doubleValue();

		System.out.println("x= "+x);
		System.out.println("y= "+y);

		// ���� 23�� �����ϰ��ִ� �⺻�ڷ��� Ÿ���� ���� b;
		int b = 12345;
	}
}