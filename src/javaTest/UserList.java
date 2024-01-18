package javaTest;

public class UserList<T> {

	// 필드

	private T[] tArray;
	private int crtPos;

	public UserList() {
		tArray = (T[]) new Object[4];
		crtPos = 0;
	}

	public void add(T o) {
		tArray[crtPos] = o;
		crtPos += 1;
	}

	public int size() {
		return crtPos;
	}

	public T get(int index) {
		return tArray[index];
	}

}
