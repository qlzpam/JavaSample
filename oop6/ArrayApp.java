public class ArrayApp {
	public static void main(String[] args){
		ArrayService service = new ArrayService();
		int[] Arry1 = service.move(3); // �ش���ġ�� ���� �迭�� �ǵ��ڸ����̵�
		int[] Arry2 = service.shift(3); // �ش� ��ġ���� �ش� Ƚ����ŭ ���������̵�
		int[] Arry3 = service.copy(5); // �ش� ��ġ�� ������ �޺κб����� ���� ������ �迭�� ������ȯ
		int[] Arry4 = service.copy(2,6); // �ش���ġ(����,��) �ȿ� ����ִ� �������� �迭�� ������ȯ
		for(int a : Arry1){
		System.out.println(a);
		}
		System.out.println();
		for(int a : Arry2){
		System.out.println(a);
		}
		System.out.println();
		for(int a : Arry3){
		System.out.println(a);
		}
		System.out.println();
		for(int a : Arry4){
		System.out.println(a);
		}
	}
}