public class MemberService{
	//�� ����
	private Member member;
	//�α��� ����
	private boolean auth;

	public MemberService(Member member){	
		this.member=member;
	}

	public boolean isAuth(){
		return auth;
	}

	// ���̵�� ��й�ȣ�� ���޹޾� ���̵� ����� ��ġ�ϸ�
	// auth ���� ture�� �����ϱ�
	public void login(String id, String password){
		if( ( member.getId().equals(id) ) && ( member.getPassword().equals(password) ) ){
			auth = true;
		}
	}

	// �α׾ƿ� ó���ϱ�
	// (auth�� ���� false�� �����ϱ�)

	public void logout(){
		auth = false;
	}

	/*
	// ���̵�� ��й�ȣ�� ���޹޾� �α��ΰ��� ���θ� ��ȯ�� �޼ҵ�
	public boolean login(String id, String password){
		boolean result = false;
		if( (member.getId() == id) && (member.getPassword() == password) ){
			result = true;
		}
		return result;
	}
	// ���̵� ���޹޾Ƽ� �α׾ƿ� ����� �����ϴ� �޼ҵ�
	public void logout(String id){
		System.out.printf("[%s]�� �α׾ƿ� �Ǿ����ϴ�.",id);
	}
	*/
}