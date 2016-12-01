public class BallMouse implements Mouse, Cleanable{

	// Mouse 인터페이스에 저장된 추상메소드 구현
	public void wheel(){
		System.out.println("빙글빙글");
	}
	public void click(){
		System.out.println("클릭클릭");
	}
	public void move(){
		System.out.println("떼굴떼굴");
	}

	// Cleanable 인터페이스에 정의된 추상메소드 구현
	public void clean(){
		System.out.println("Ball의 먼지 제거 완료");
	}

}