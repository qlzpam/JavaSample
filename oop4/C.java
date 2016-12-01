public class C{
	int x;
	static int y;
	static{
		// 정적 초기화블록.  정적변수의 초기화 작업에 필요한 수행문을 적는다
		// 주로 프로그램 실행에 사용되는 외부 리소스 연결작업을 구현한다.
		System.out.println("초기화 블록이 실행됨");
		// 정적메소드, 정적 변수만 사용가능.
	}
	public C(){
		System.out.println("생성자실행됨");
	}
}