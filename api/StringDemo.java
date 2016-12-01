public class StringDemo{
	public static void main(String[] args){

		String str = "�ڹ� ���α׷��� ����";

		// ���ڿ��� ���̸� ��ȯ�ϴ¸޼ҵ�
		int len = str.length();
		System.out.println("���ڿ��� ����: "+len);

		//���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ¸޼ҵ�
		boolean empty = str.isEmpty();
		System.out.println("�� ���ڿ��ΰ�? "+empty);

		// ���ڿ����� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String trim();
		String str2 = "    ȫ �� �� " ;
		String str3 = str2.trim();
		System.out.println("str2["+str2+"]");
		System.out.println("str3["+str3+"]");

		// ���ڿ��� ������ ���ؼ� ������ ������ ���� ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ� boolean equals(Obect obr)
		String str4 = "����";
		String str5 = "����";
		boolean equal = str4.equals(str5);
		System.out.println("������ ���ڿ��ΰ�? "+ equal);

		String str6 = "apple";
		String str7 = "Apple";
		equal = str6.equals(str7);
		System.out.println("������ ���ڿ��ΰ�? "+ equal);
		equal = str6.equalsIgnoreCase(str7);
		System.out.println("������ ���ڿ��ΰ�? "+ equal);


		// ���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
		// boolean contains(String s)

		String str8 = "�ڹ� ���α׷���";
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ°�? "+contains);

		//���ڿ����� ������ ��ġ�� ���ڸ� ��ȯ�ϴ� �޼ҵ�
		// char charAt(int index)
		char ch=str8.charAt(1);
		System.out.println("1��° ���ڴ�?"+ch);

		//���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ�
		//int indexOf(String str)

		int index = str8.indexOf("���α�");
		System.out.println("���ڿ����� [���α�]�̶�� ���ڰ� ó������ �����ϴ� ��ġ��?" + index);

		// ���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
		// String replace(String target, String newstr)

		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8 ["+str8+"]");
		System.out.println("str9 ["+str9+"]");

		// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ¸޼ҵ�
		// String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String sub1 = str10.substring(5);
		System.out.println("5������ �߶� ���ڿ�: " + sub1);

		//���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ�
		// String substring(int begin, int end)

		String sub2 = str10.substring(0,4);
		System.out.println("0������ 4���ձ��� �߳��� ���ڿ�: "+sub2);

		//���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String text = "����, ���, ��õ, ����, �λ�, ����, ���, �뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);

		//���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		//String toUpperCase(), String toLowerCase();
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");

		// ����, �Ǽ�, �Ҹ��� ��� ���������� ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� �����޼ҵ�
		// String valueOf(int or double or ....)
		int number = 1234;
		//���� 1234�� ����123���� ��ȯ.
		String str13 = String.valueOf(number);

	}
}