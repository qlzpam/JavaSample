public class ArrayDemo5 {
	public static void main(String[] args) {
		
		String[][] names = {{"�����", "���ð�"}, {"����ȭ", "���߱�", "��ΰ�"}, {"������"}};

		// �迭�� ũ�� 
		System.out.println("�迭�� ũ��: " + names.length);
		//0��° �迭�� ũ�� 
		System.out.println("0��° �迭�� ũ��: " + names[0].length);
		//1���� �迭�� ũ��
		System.out.println("1��° �迭�� ũ��: " + names[1].length);
		//2��° �迭�� ũ��
		System.out.println("2��° �迭�� ũ��: " + names[2].length);

		for (int i=0; i<names.length; i++) {
			
			for (int j=0; j<names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		System.out.println();
	}
}