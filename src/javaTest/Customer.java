package javaTest;

public class Customer extends User {

	// 필드

	private int point; // 포인트점수

	// 생성자

	public Customer() {
		super();
	}

	public Customer(int point) {
		super();
		this.point = point;
	}

	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;
	}

	// 메소드 g/s

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Customer [point=" + point + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	@Override
	public void showInfo() {
		System.out.println("아이디:" + id + "   " + "비번:" + pw + "   " + "이름:" + name + "   " + "포인트:" + point);

	}

}
