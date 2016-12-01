public class ArrayApp {
	public static void main(String[] args){
		ArrayService service = new ArrayService();
		int[] Arry1 = service.move(3); // 해당위치의 값을 배열의 맨뒷자리로이동
		int[] Arry2 = service.shift(3); // 해당 위치값을 해당 횟수만큼 왼쪽으로이동
		int[] Arry3 = service.copy(5); // 해당 위치의 값부터 뒷부분까지의 값을 가지는 배열을 만들어반환
		int[] Arry4 = service.copy(2,6); // 해당위치(시작,끝) 안에 들어있는 값을가진 배열을 만들어반환
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