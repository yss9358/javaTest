package javaTest;

public abstract class User {

	// 필드

	protected String id; // 아이디
	protected String pw; // 패스워드
	protected String name; // 이름

	// 생성자

	public User() {

	}

	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	// 메소드 g/s

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	public abstract void showInfo();
}
