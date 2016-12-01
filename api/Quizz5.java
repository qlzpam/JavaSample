public class Quizz5{
	public static void main(String[] args){
		String[] words = {"ㅅㅂ", "꼬죠", "바벙", "멍충"};
		String text = "ㅅㅂ야 내려와";
		// word에 적혀있는 단어포함여부 알아내기.
		boolean isContains = false;
		for (int i=0; i<words.length; i++){
			if( text.contains(words[i]) ){
				isContains = true;
				break;
			}
		}
		System.out.println("유해언어 포함여부:" + isContains);
	}
}