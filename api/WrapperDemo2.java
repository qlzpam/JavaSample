public class WrapperDemo2{
	public static void main(String[] args){
		// Integer�� ���� �޼ҵ�

		//���ڿ��� int ���� ��ȯ�ϴ� �޼ҵ� : int parseInt(String text)
		int num1 = Integer.parseInt("123");

		int num2 = Integer.parseInt("11", 2); // 2������ 10������ ��ȯ. �ڿ� ���ڴ� ������ ����Ų��.

		System.out.println("num2: " + num2); // 3

		int num3 = Integer.parseInt("ab1", 16); // 16������ 10������ ��ȯ. 

		System.out.println("num3: " + num3); // 2737

		String str1 = Integer.toBinaryString(12); // 10������ 2������ ��ȯ.
		System.out.println("str1: " + str1); // 1100

		String str2 = Integer.toHexString(15345); // 10������ 17������ ��ȯ.
		System.out.println("str2: " + str2); // 3bf1
	}
}