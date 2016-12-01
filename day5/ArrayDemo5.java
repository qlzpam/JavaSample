public class ArrayDemo5 {
	public static void main(String[] args) {
		
		String[][] names = {{"박재범", "성시경"}, {"정용화", "송중기", "김민경"}, {"문세윤"}};

		// 배열의 크기 
		System.out.println("배열의 크기: " + names.length);
		//0번째 배열의 크기 
		System.out.println("0번째 배열의 크기: " + names[0].length);
		//1번재 배열의 크기
		System.out.println("1번째 배열의 크기: " + names[1].length);
		//2번째 배열의 크기
		System.out.println("2번째 배열의 크기: " + names[2].length);

		for (int i=0; i<names.length; i++) {
			
			for (int j=0; j<names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		System.out.println();
	}
}