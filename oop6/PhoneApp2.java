public class PhoneApp2{
	public static void main(String[] args){
		SmartPhone p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();

		// p1은 Phone을 상속받은 자식 SmartPhone 객체이기때문에
		// Phone의기능과 변수 SmartPhone의 기능과 변수 모두 사용가능
		p1.ip = "192.168.0.1";
		p1.web("www.naver.com");
		p1.telNumber = "010-123-4567";
		p1.call("010-1111-1111");

		//SmartPhone 와 FeaturePhone을 Phone 타입의 참조변수에 담기
		//상속관계에 있는 클래스일 경우 부모타임의 참조변수에 자식클래스 타입의 객체를 저장할 수 있다.
		Phone p3 = new SmartPhone();
		Phone p4 = new FeaturePhone();

		//p3.web("www.daum.net");
		p3.telNumber = "010-1234-5678";
		p3.call("010-2222-2222");

	}
}