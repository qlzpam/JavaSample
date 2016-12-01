public class WrapperDemo1{
	public static void main(String[] args){
		// 정수 23을 가지고있는 Integer 객체를 참조하는 a
		Integer a = new Integer(12345); // <=== 이과정을 박싱(boxing)이라고한다.
		// Integer 객체에 보관된 정수값을 반환하는 메소드 : int intValue()
		int x = a.intValue(); // <=== 이과정을 언박싱(unboxing)이라고한다.
		double y = a.doubleValue();

		System.out.println("x= "+x);
		System.out.println("y= "+y);

		// 정수 23을 저장하고있는 기본자료형 타입의 정수 b;
		int b = 12345;
	}
}