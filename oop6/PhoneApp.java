public class PhoneApp{
	public static void main(String[] args){
		SmartPhone p = new SmartPhone();
		p.telNumber = "010-1234-5678";
		p.message("010-2222-2222", "오늘 몇시에 만날까?");

		p.ip = "210.11.123.152";
		p.email = "hong@gamil.com";

		p.web("http://www.daum.net");
		p.sendEmail("lee@gmail.com","과제물","주말 코딩과제입니다.");

			FeaturePhone f = new FeaturePhone();
			f.telNumber = "010-4567-8963";
			f.call("010-1111-1111");
			f.message("010-1111-1111","7시에 교보문고 앞에서 만나");
			f.keypad();
	}
}