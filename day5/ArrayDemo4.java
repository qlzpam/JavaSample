public class ArrayDemo4 {
	public static void main(String[] arsgs) {
		/*
		String[][] groups = new String[2][3];
		
		// ������ �迭�� �� �����ϱ�
		groups[0][0] = "�����";
		groups[0][1] = "������";
		groups[0][2] = "���߱�";

		groups[1][0] = "���ð�";
		groups[1][1] = "����ȭ";
		groups[1][2] = "����";
		*/
		String[][] groups = {{"�����", "������", "���߱�"}, {"���ð�", "����ȭ", "����"}};
		/*
		// ������ �迭�� �� ǥ���ϱ�
		for (int i=0; i<2; i++) {
			for (int f=0; f<3; f++) {
				System.out.printf("(%d, %d) => %s", i, f, groups[i][f] + "\t");
			}
			System.out.println();
		}
		*/
		for (String[] group : groups) {
			for (String name : group) {
				System.out.print(name + "\t");
			}
			System.out.println();
		}
	}
}

 
