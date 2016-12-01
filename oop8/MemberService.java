public class MemberService{
	//고객 정보
	private Member member;
	//로그인 여부
	private boolean auth;

	public MemberService(Member member){	
		this.member=member;
	}

	public boolean isAuth(){
		return auth;
	}

	// 아이디와 비밀번호를 전달받아 아이디 비번이 일치하면
	// auth 값을 ture로 변경하기
	public void login(String id, String password){
		if( ( member.getId().equals(id) ) && ( member.getPassword().equals(password) ) ){
			auth = true;
		}
	}

	// 로그아웃 처리하기
	// (auth의 값을 false로 변경하기)

	public void logout(){
		auth = false;
	}

	/*
	// 아이디와 비밀번호를 전달받아 로그인가능 여부를 반환한 메소드
	public boolean login(String id, String password){
		boolean result = false;
		if( (member.getId() == id) && (member.getPassword() == password) ){
			result = true;
		}
		return result;
	}
	// 아이디를 전달받아서 로그아웃 기능을 수행하는 메소드
	public void logout(String id){
		System.out.printf("[%s]님 로그아웃 되었습니다.",id);
	}
	*/
}