public class Quizz3{
	public static void main(String[] args){
		//a~z까지 각각 영문자가 몇개들어있는지 알아내기.
		String text = "the principal operations on a stringBuilder are the append and insert methods, which are overloaded so as to accept data of any type";
		int[] arr = new int[26];
		for(int i = 0; i<text.length();i++){
			int c = text.charAt(i)-97;
			if(c>=0){
				arr[c]++;
			}
		}
		for(int i = 0 ; i<arr.length; i++){
			System.out.println((char) (i+97) + ": " + arr[i]);
		}
	}
}