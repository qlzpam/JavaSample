import java.util.StringTokenizer;
public class StringTokenizerDemo{
	public static void main(String[] args){
	String text = "���� �ٴ�     Ǫ����";

	/*
	StringTokenizer st = new StringTokenizer(text);
	int length = st.countTokens();
	System.out.println("�ܾ� ����: " + length);

	while( st.hasMoreTokens()){
		String token = st.nextToken();
		System.out.println(token);
		System.out.println("���� ��ū ����: " + st.countTokens());
	}
	*/
	String[] tokens = text.split(" ");
	System.out.println("�ܾ� ����: " + tokens.length);
	

	}
}