public class B{
	int x;
	static int y;
	public void m1(){
		System.out.println(x);
		System.out.println(y);
	}
	// non static 변수 사용불가, this 사용불가(생성자가 아직없어서)
	public static void m2(){   // static 이 붙으면 객체를 만들지않고 실행가능함
		// System.out.println(x); => 객체가 안만들어지면 x는 없기때문에 오류발생
		System.out.println(y);
	}
	public void m3(){
		m1();
		m2();
	}
	public static void m4(){
		// m1(); => 객체가 안만들어지면 m1()은 없기때문에 오류발생
		m2();
	}
}