public class MemberApp{
	public static void main(String[] args){
		// 회원 정보를 담기위한 Member 객체를 생성하고
		Member m1 = new Member();
		// setter를 사용해서 이름, 아이디, 비번, 나이 등의 데이타를 객체에 저장하기
		m1.setName("아무개");
		m1.setId("ID임");
		m1.setPassword("123123");
		m1.setAge(25);

		// 생성된 Member 객체에 저장된 값을 getter 함수를 사용해서 화면에 출력하기
		System.out.printf("이름: %s\n",m1.getName());
		System.out.printf("아이디: %s\n",m1.getId());
		System.out.printf("나이: %s\n",m1.getAge());
	}
}