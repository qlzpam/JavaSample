public class ArrayService{
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
	int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
	// �迭 �̵���Ű��
	// ���� �Է¹޾� ���� �ش���ġ�� ���� arr1 �迭 �ǵڿ� ��ġ��Ű��.
	public int[] move(int index){
		int temp = arr1[index];
		for(int i=index; i<9;i++){
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	}

	// �ش���ġ���� �Է¹��� Ƚ����ŭ �������� ���̵���Ű��
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
	// �迭 �����ϱ�
	// arr2 �迭�� ������ ��ġ���� �������� ���� ���� �迭�� ����� ��ȯ�ϱ�
	public int[] copy(int begin){
		int[] tempArry = new int[10-begin];
		int i = 0;
		for(int j=begin; j<10;j++){
			tempArry[i] = arr2[j];
			i++;
		}
		return tempArry;
	}
	// �迭 �߶󳻱�
	// arr3 �迭�� ������ ��ġ���� ������ ��ġ������ ���� ���� �迭 ��ȯ
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