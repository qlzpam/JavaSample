public class App{
	public static void main(String[] args){
		// staic 변수는 객체 생성없이
		// 클래스명.변수명으로 사용 가능 ex) a.y
		System.out.println(A.y);

		//정적 변수 y 에 값 할당하기
		//A클래스는 사용해서 만든 모든객체는
		//정적(static) 변수 y 값을 공유한다.
		A.y = 100;

		A a1 = new A();
		//a1.x = 10;
		System.out.println(a1.y +" "+ a1.x); // 객체.y로 y 값이 출력되기는 하지만 y를 멤버변수로 오해하기쉽다.

		A a2 = new A();
		//a2.x = 20;
		System.out.println(A.y +" "+ a2.x);

		A a3 = new A();
		//a3.x = 30;
		System.out.println(A.y +" "+ a3.x);
	}
}