public class Demo9 {
	public static void main(String[] arg) {
		// ����Ŀ����� ����ȯ
		
		int a = 4;
		int b = 5;
		int c = a/b;
		// ���꿡 ������ ���� ������ ������ 
		// ������ ��� 0.8�� ���� 0���� ��ȯ�� ������� �������.
		System.out.println(c);

		double d = a/(double)b; // 4/5.0 -> 4.0/5.0 => 0.8
		System.out.println(d);
	}

}