public class PhoneApp2{
	public static void main(String[] args){
		SmartPhone p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();

		// p1�� Phone�� ��ӹ��� �ڽ� SmartPhone ��ü�̱⶧����
		// Phone�Ǳ�ɰ� ���� SmartPhone�� ��ɰ� ���� ��� ��밡��
		p1.ip = "192.168.0.1";
		p1.web("www.naver.com");
		p1.telNumber = "010-123-4567";
		p1.call("010-1111-1111");

		//SmartPhone �� FeaturePhone�� Phone Ÿ���� ���������� ���
		//��Ӱ��迡 �ִ� Ŭ������ ��� �θ�Ÿ���� ���������� �ڽ�Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.
		Phone p3 = new SmartPhone();
		Phone p4 = new FeaturePhone();

		//p3.web("www.daum.net");
		p3.telNumber = "010-1234-5678";
		p3.call("010-2222-2222");

	}
}