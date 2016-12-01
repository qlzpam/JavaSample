public class ArrayService{
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
	// 배열 이동시키기
	// 값을 입력받아 에서 해당위치의 값을 arr1 배열 맨뒤에 위치시키기.
	public int[] move(int index){
		int temp = arr1[index];
		for(int i=index; i<9;i++){
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	}

	// 해당위치값을 입력받은 횟수만큼 왼쪽으로 값이동시키기
	public int[] shift(int index, int step){
		if(step<=10){
		step-=10;
		}
		int[] tempArry = new int[10];
		tempArry=arr4;
		int temp = tempArry[index];
		for(int j=index; j<9;j++){
			tempArry[j] = tempArry[j+1];
		}
		tempArry[9]=temp;
		return tempArry;
	}
	// 배열 복사하기
	// arr2 배열을 지정된 위치부터 끝까지의 값을 갖는 배열을 만들어 반환하기
	public int[] copy(int begin){
		int[] tempArry = new int[10-begin];
		int i = 0;
		for(int j=begin; j<10;j++){
			tempArry[i] = arr2[j];
			i++;
		}
		return tempArry;
	}
	// 배열 잘라내기
	// arr3 배열을 지정된 위치부터 지정된 위치까지의 값을 갖는 배열 반환
	public int[] copy(int begin, int end){
		int size = 0;
		for(int i = begin; i<=end; i++){
			size++;
		}
		int[] tempArry = new int[size];
		int i = 0;
		for(int j=begin; j<=end;j++){
			tempArry[i] = arr3[j];
			i++;
		}
		return tempArry;
	}
}