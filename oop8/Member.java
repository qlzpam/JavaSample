public class Member {
	// 필드 정의 ( 은닉화 )
	private String name, id, password;
	int age;
	// 기본 생성자 정의
	public Member(){}
	// gettter / setter 정의

	public Member(String name, String id){
		this.name=name;
		this.id=id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age= age;
	}
}