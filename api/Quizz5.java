public class Quizz5{
	public static void main(String[] args){
		String[] words = {"����", "����", "�ٺ�", "����"};
		String text = "������ ������";
		// word�� �����ִ� �ܾ����Կ��� �˾Ƴ���.
		boolean isContains = false;
		for (int i=0; i<words.length; i++){
			if( text.contains(words[i]) ){
				isContains = true;
				break;
			}
		}
		System.out.println("���ؾ�� ���Կ���:" + isContains);
	}
}