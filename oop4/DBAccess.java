public class DBAccess{
	// DBAccess 객체를 생성해서 static 변수에 저장한다.
	private static DBAccess db = new DBAccess();
	// 생성자를 은닉화시킨다.
	private DBAccess(){}

	// 생성된 DBAccess 객체를 참조할수있는 값을 제공해주는
	// 정적메소드를 제공한다.
	public static DBAccess getInstance(){
		return db;
	}
	public void insert(){
		System.out.println("추가 작업");
	}
	public void update(){
		System.out.println("수정 작업");
	}
	public void delete(){
		System.out.println("삭제 작업");
	}
	public void retrieve(){
		System.out.println("추가 작업");
	}
}