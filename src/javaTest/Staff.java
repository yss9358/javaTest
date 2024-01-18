package javaTest;

public class Staff extends User {

	// 필드

	private int salary; // 월급

	// 생성자

	public Staff() {
		super();
	}

	public Staff(int salary) {
		super();
		this.salary = salary;
	}

	public Staff(String id, String pw, String name, int salary) {
		super(id, pw, name);
		this.salary = salary;
	}

	// 메소드 g/s

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Staff [salary=" + salary + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	@Override
	public void showInfo() {
		System.out.println("아이디:" + id + "   " + "비번:" + pw + "   " + "이름:" + name + "   " + "월급:" + salary);

	}

	public void pay() {
		System.out.println(name + "의 연봉은 " + 12 * salary + "원 입니다.");
	}

}
