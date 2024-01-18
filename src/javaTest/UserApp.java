package javaTest;

public class UserApp {

	public static void main(String[] args) {

		UserList<User> uList = new UserList<User>();

		Staff s01 = new Staff("master", "m7788", "운영자", 3500000);
		Customer c01 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		Customer c02 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		Customer c03 = new Customer("ms-park", "y2345", "박명수", 1200);

		uList.add(s01);
		uList.add(c01);
		uList.add(c02);
		uList.add(c03);

		System.out.println("--------------------회원 + 운영자 전체리스트---------------------");

		for (int i = 0; i < uList.size(); i++) {
			System.out.print((i + 1) + ".");
			uList.get(i).showInfo();
		}

		System.out.println("");
		s01.pay();

	}

}
