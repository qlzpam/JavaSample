public class ArrayDemo4 {
	public static void main(String[] arsgs) {
		/*
		String[][] groups = new String[2][3];
		
		// 다차원 배열에 값 저장하기
		groups[0][0] = "박재범";
		groups[0][1] = "서강준";
		groups[0][2] = "송중기";

		groups[1][0] = "성시경";
		groups[1][1] = "정용화";
		groups[1][2] = "온유";
		*/
		String[][] groups = {{"박재범", "서강준", "송중기"}, {"성시경", "정용화", "온유"}};
		/*
		// 다차원 배열의 값 표시하기
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

 
