import java.util.StringTokenizer;
public class StringTokenizerDemo{
	public static void main(String[] args){
	String text = "동해 바다     푸르다";

	/*
	StringTokenizer st = new StringTokenizer(text);
	int length = st.countTokens();
	System.out.println("단어 갯수: " + length);

	while( st.hasMoreTokens()){
		String token = st.nextToken();
		System.out.println(token);
		System.out.println("남은 토큰 갯수: " + st.countTokens());
	}
	*/
	String[] tokens = text.split(" ");
	System.out.println("단어 갯수: " + tokens.length);
	

	}
}